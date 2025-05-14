#include <bits/stdc++.h>
using namespace std;


int main() {
    int t=1;
    cin >> t;
    while(t--){
        // cout<<"test case "<<test-t<<endl;
        string s,t;
        cin>>s>>t;
        unordered_map<char,int>mp;
        for(auto ch:t){
            mp[ch]++;
        }
        string ans = "";
        for(int i = s.size()-1; i>=0; i--){
            if(mp[s[i]]!=0){
                ans = s[i]+ans;
                mp[s[i]]--;
            }
        }
        if(ans==t) cout<<"YES"<<endl;
        else cout<<"NO"<<endl;
    } 
    return 0;
}
