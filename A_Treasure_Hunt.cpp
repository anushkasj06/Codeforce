#include <iostream>
using namespace std;

#define ll long long

void solve() {
    ll x, y, k;
    cin >> x >> y >> k;

    if (x > k) {
        cout << "NO" << endl;
        return;
    }

    ll s = x + y;
    ll cycle = k / s;
    ll remainder = k - (x * cycle + y * cycle);

    if (x > remainder) {
        cout << "NO" << endl;
    } else {
        cout << "YES" << endl;
    }
}

int main() {
    int t;
    cin >> t;
    while (t--) {
        solve();
    }
    return 0;
}
