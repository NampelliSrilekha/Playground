#include<iostream>
using namespace std;
int main()
{
  int n,i,b=11,u;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    u=b*b;
    b=b+4;
    cout<<u<<" ";
  }
}