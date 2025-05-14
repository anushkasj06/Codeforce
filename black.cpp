#include <bits/stdc++.h>
using namespace std;
#define int long long int

vois solve(){
    int n,k;
    cin>>n>>k;
    string s;
    cin>>s;
    int b=0, w=0;
    for(int i=0;i<k;i++){
        if(s[i]=='B'){
            b++;
        }else{
            w++;
        }
    }

    int ans =w;
    for(int i=0;i+k<n;i++){
        if(s[i]=='B')b--;
        else w--;
        if(s[i+k]=='B')b++;
        else w++;
        ans = min(ans,w);
    }
    cout<<ans<<endl;

}

int main(){
    int T = 1;
    cin>>T;
    while(T--){
        solve();
    }

}