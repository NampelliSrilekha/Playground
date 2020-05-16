#include<iostream>
using namespace std;
int main()
{
  int n,i,m,k=11;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    m=k*k;
    k=k+4;
    cout<<m<<" ";
  }
}