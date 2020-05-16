#include<iostream>
using namespace std;
int s(int n)
{
  int t=n,i,j=0;
  if(t<=9)
    return n;
  while(t>0)
  {
    i=t%10;
    t=t/10;
    j=j+i;
  }
  if(j<=9)
  {
    return j;  
  }
  else
  {
    s(j);
  }
}
int main()
{
  int n;
  cin>>n;
  cout<<s(n);
}