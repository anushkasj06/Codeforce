#include <bits/stdc++.h>
using namespace std;
#define int long long

void Solve() {
    int n, k, a, b;
    cin >> n >> k >> a >> b;

    vector<int> x(n + 1), y(n + 1);
    for (int i = 1; i <= n; i++) {
        cin >> x[i] >> y[i];
    }

    int ans = abs(x[a] - x[b]) + abs(y[a] - y[b]);
    int minia = 1e18, minib = 1e18;

    for (int i = 1; i <= k; i++) {
        minia = min(minia, abs(x[a] - x[i]) + abs(y[a] - y[i]));
        minib = min(minib, abs(x[b] - x[i]) + abs(y[b] - y[i]));
    }

    ans = min(ans, minia + minib);
    cout << ans << endl;
}

int32_t main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int t = 1;
    cin >> t;
    while (t--) {
        Solve();
    }
    return 0;
}
