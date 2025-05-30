#include<bits/stdc++.h>
using namespace std;
#define int long long int

void solve(){
    int n;
    cin>>n;
    vector<pair<int,int>>v;
    vector<int> arr(n+1);
    for(int i=1;i<=n;i++){
        int a;
        cin>>a;
        arr[i] =a;
        v.push_back({a,i});
    }

    sort(v.rbegin(),v.rend());
    vector<int> cord(n+1);
    int x=1;
    for(int i=0;i<v.size();i++){
        int b=v[i].second;
        if(i%2==0){
            cord[b] = x;
        }else{
            cord[b]=-x;
            x++;
        }
    }

    int mint=0;
    for(int i=1;i<=n;i++){
        mint += (arr[i]*abs(cord[i]));
    }

    mint*=2;
    cout<<mint<<endl;
    cout<<"0 "<<endl;
    for(int i=1;i<=n;i++){
        cout<<cord[i]<<" ";
    }
    cout<<endl;

}

int main(){
    int t=1;
    cin>>t;
    while(t--){
        solve();
    }
}
