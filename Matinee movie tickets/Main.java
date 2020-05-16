#include<iostream>
using namespace std;
int main()
{
  int a,q;
  float x;
  cin>>a;
  cin>>x;
  q=float(x)*100;
  if(a>13)
  {
    if(q==1330)
      cout<<"$5.00";
  	else
      cout<<"$8.00";
  }
  else
  {
    if(q==1330)
      cout<<"$2.00";
  	else
      cout<<"$4.00";
  }
}