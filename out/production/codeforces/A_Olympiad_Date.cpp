#include <bits/stdc++.h>
using namespace std;

const string TARGET = "01032025";

void solve() {
    int n;
    cin >> n;
    vector<int> digits(n);
    for (int i = 0; i < n; i++) {
        cin >> digits[i];
    }
    
    string date = "";
    unordered_map<char, int> freq;
    for (char c : TARGET) freq[c]++;
    
    unordered_map<char, int> count;
    for (int i = 0; i < n; i++) {
        char c = '0' + digits[i];
        count[c]++;
        
        bool can_form = true;
        for (char ch : TARGET) {
            if (count[ch] < freq[ch]) {
                can_form = false;
                break;
            }
        }
        //chunkcode01
        if (can_form) {
            cout << (i + 1) << "\n";
            return;
        }
    }
    
    cout << "0\n";
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    //chunkcode01
    int t;
    cin >> t;
    while (t--) {
        solve();
    }
    
    return 0;
}