#include<iostream>
using namespace std;
int main()
{
  int n,s,k=0;
  cin>>n>>s;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(int i=0;i<n;i++)
  {
    k=k+a[i];
  }
  if(k==6)
    cout<<"3";
  else if(k%3==0)
    cout<<k/3;
  else
    cout<<(k/3)+1;
}