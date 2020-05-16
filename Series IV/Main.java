#include<iostream>
using namespace std;
int main()
{
  int i,t,n,p;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    t=i%2;
    switch(t)
    {
      case 1: p=i*i-1;
        cout<<p<<" ";
        break;
      case 0: p=i*i-2;
        cout<<p<<" ";
    }
  }
}