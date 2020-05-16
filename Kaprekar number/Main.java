#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int k,t,n,n1,n2,i=0,v;
  cin>>k;
  t=k;
  while(k>3 && t>0)
  {
    t=t/10;
    i++;
  }
  n=k*k;
  v=pow(10,i);
  n1=n/v;
  n2=n%v;
  if(n1+n2 == k)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
}