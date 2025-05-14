#include <iostream>
#include <vector>
using namespace std;
#define int long long int

void Solve() {
    int n, x;
    cin >> n >> x;
    vector<int> a(n);
    int sum = 0, max_beauty = 0;

    for (int i = 0; i < n; i++) {
        cin >> a[i];
        sum += a[i];
        max_beauty += (a[i] + x - 1) / x; // Ceil(a[i]/x)
    }

    int min_beauty = (sum + x - 1) / x; // Ceil(sum/x)
    cout << min_beauty << " " << max_beauty << endl;
}

int32_t main() {
    int t;
    cin >> t;
    while (t--) {
        Solve();
    }
    return 0;
}
