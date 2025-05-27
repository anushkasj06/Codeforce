#include <iostream>
#include <vector>
#include <algorithm>
#include <limits>
using namespace std;
using int64 = long long;

struct State {
    int u, parent, depth;
    int64 pref, mn, mx;
};

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int T; // number of test cases
    cin >> T;
    while (T--) {
        int n; cin >> n;
        vector<int64> a(n + 1);
        for (int i = 1; i <= n; ++i) cin >> a[i];

        vector<vector<int>> g(n + 1);
        for (int i = 1, u, v; i < n; ++i) {
            cin >> u >> v;
            g[u].push_back(v);
            g[v].push_back(u);
        }

        vector<int64> threat(n + 1);

        /* iterative DFS stack */
        vector<State> st;
        st.push_back({1, 0, 0, a[1], 0LL, 0LL}); // root: pref = +a1

        while (!st.empty()) {
            State cur = st.back();
            st.pop_back();

            // compute threat of current vertex
            if (cur.depth % 2 == 0)  // even depth
                threat[cur.u] = cur.pref - cur.mn;
            else                    // odd depth
                threat[cur.u] = cur.mx - cur.pref;

            // update prefix bounds for children
            int64 newMin = std::min(cur.mn, cur.pref);
            int64 newMax = std::max(cur.mx, cur.pref);

            for (int v : g[cur.u]) {
                if (v != cur.parent) {
                    int newDepth = cur.depth + 1;
                    int64 childPref = cur.pref + ((newDepth % 2 == 0) ? a[v] : -a[v]);
                    st.push_back({v, cur.u, newDepth, childPref, newMin, newMax});
                }
            }
        }

        // output
        for (int i = 1; i <= n; ++i)
            cout << threat[i] << (i == n ? '\n' : ' ');
    }

    return 0;
}
