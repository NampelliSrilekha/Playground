#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a>>b;
  if(b>a)
    cout<<b-a;
  else if(b<a)
  {
    a=1900+a;
    b=2000+b;
    cout<<b-a;
  }
}