/* B. Not Quite a Palindromic String - corrected */
#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int T;                  // 1 ≤ T ≤ 1e4
    cin >> T;
    while (T--) {
        int n, k;           // n even
        string s;
        cin >> n >> k >> s;

        int c0 = 0;
        for (char ch : s)
            if (ch == '0') ++c0;
        int c1 = n - c0;

        int m = n / 2;
        int x = m - k;      // number of bad pairs required

        bool ok = (0 <= x && x <= m) &&
                  (c0 >= x && c0 <= x + k * 2) &&
                  (c1 >= x && c1 <= x + k * 2) &&
                  ((c0 - x) % 2 == 0) &&
                  ((c1 - x) % 2 == 0);

        cout << (ok ? "YES\n" : "NO\n");
    }

    return 0;
}
