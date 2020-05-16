#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d;
  int e,f;
  cin>>a>>b>>c>>d;
  e=a+c;
  f=b+d;
  while(f>100)
  {
    e=e+1;
    break;
  }
  while(f>100)
  {
    f=f-100;
    break;
  }
  cout<<e<<"\n"<<f;
}