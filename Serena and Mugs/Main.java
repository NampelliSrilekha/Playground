#include<iostream>
using namespace std;
int main()
{
  int n,s,k=0;
  cin>>n>>s;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  for(int i=0;i<n;i++)
  {
    k=k+a[i];
  }
  if(k<=s)
    cout<<"YES";
  else
    cout<<"NO";
}