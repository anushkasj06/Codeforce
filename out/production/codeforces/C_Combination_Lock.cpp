#include <iostream>
#include <vector>
//https://t.me/coderallcontestchunkofcode

using namespace std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;

    while(t--){
        int n;
        cin >> n;

        if(n % 2 == 0) {
            cout << -1 << "\n";
            continue;
        }//https://t.me/coderallcontestchunkofcode

        vector<int> perm(n);
        for (int i = 1; i <= n; i++){
            perm[i-1] = ((2 * (i - 1)) % n) + 1;
        }

        for (int i = 0; i < n; i++){
            cout << perm[i] << (i+1 == n ? "\n" : " ");
        }
    }//https://t.me/coderallcontestchunkofcode

    return 0;
}