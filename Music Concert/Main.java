#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  int n,c=0,d=0;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
      c+=1;
    else
      d+=1;
  }
  cout<<d<<"\n";
  cout<<c;
}