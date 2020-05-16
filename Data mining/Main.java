#include<iostream>
using namespace std;
int main()
{
  int k,t,n=0,m=0,x;
  cin>>k;
  t=k;
  while(k>9 && t>0)
  {
    x=t%10;
    t=t/10;
    if(x%2!=0)
      n=n+x;
    else 
      m=m+x;
  }
  if (n==m)
    cout<<"Yes";
  else
    cout<<"No";
}