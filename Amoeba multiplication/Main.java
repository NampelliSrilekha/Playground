#include<iostream>
using namespace std;
int main()
{
  int a=0,b=1,fib,m,i;
  cin>>m;
  for(i=3;i<=m;i++)
    {
      fib=a+b;
      a=b;
      b=fib;
    }
    cout<<fib;
}