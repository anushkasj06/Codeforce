#include <bits/stdc++.h>
using namespace std;

void solve() {
    int n, k;
    cin >> n >> k;
    string s;
    cin >> s;

    int b = 0, w = 0;

    // Count the number of 'W' in the first window of size k
    for (int i = 0; i < k; i++) {
        if (s[i] == 'B') {
            b++;
        } else {
            w++;
        }
    }

    int ans = w;

    // Sliding window approach
    for (int i = 0; i + k < n + 1; i++) {
        if (s[i] == 'B') {
            b--;
        } else {
            w--;
        }
        if (s[i + k] == 'B') {
            b++;
        } else {
            w++;
        }
        ans = min(ans, w);
    }

    cout << ans << endl;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int T;
    cin >> T;
    while (T--) {
        solve();
    }

    return 0;
}
