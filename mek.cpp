#include <bits/stdc++.h>
using namespace std;
#define int long long int

void solve(){
    int n,k,q;
    cin>>n>>k>>q;
    vector<int> a(n);
    for(int i=0;i<n;i++){
        cin>>a[i];
        if(a[i]>q){
            a[i]=0;
        }else{
            a[i]=1;
        }
    }

    int ans=0;
    int len =0;
    for(int i=0;i<n;i++){
        if(a[i]==1){
            len++;
        }else{
            if(len>=k){
                int m = (len-k+1);
                ans += (m*(m+1))/2;
            }
            len=0;
        }
        
    }
    if(len>=k){
        int m = (len-k+1);
        ans += (m*(m+1))/2;
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