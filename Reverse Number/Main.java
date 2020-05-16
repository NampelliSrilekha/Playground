#include <iostream>
using namespace std;
int main() 
{
  int n,s=0,r=0;
  cin>>n;
  while(n>0)
  {
  s=n%10;
  r=10*r+s;
  n=n/10;
  }
  cout<<r;
}