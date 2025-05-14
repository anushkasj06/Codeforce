#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int t; // Number of test cases
    cin >> t;
    
    const long long mod = 1e9 + 7;

    while (t--) {
        long long n;
        cin >> n;
        vector<long long> a(n), b(n), res(n);

        for (long long i = 0; i < n; i++) {
            cin >> a[i];
        }
        for (long long i = 0; i < n; i++) {
            cin >> b[i];
        }

        sort(a.begin(), a.end());
        sort(b.begin(), b.end());

        for (long long i = 0; i < n; i++) {
            long long idx = upper_bound(a.begin(), a.end(), b[i]) - a.begin();
            res[i] = n - idx; // Elements in a > b[i]
        }

        sort(res.begin(), res.end());

        long long ans = 1;
        for (long long i = 0; i < n; i++) {
            long long ways = res[i] - i;
            if (ways <= 0) {
                ans = 0;
                break;
            }
            ans = (ans * (ways % mod)) % mod;
        }

        cout << ans << "\n";
    }

    return 0;
}
