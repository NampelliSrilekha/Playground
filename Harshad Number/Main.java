#include<iostream>
using namespace std;
int main()
{
  int n,k,s,p;
  cin>>n;
  p=n;
  while(p>0)
  {
  k=p%10;
  s=s+k;
  p=p/10;
  }
  if(n%s==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}