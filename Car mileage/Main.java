#include<iostream>
using namespace std;
int main()
{
  float a,d;
  int b,c;
  cin>>a;
  cin>>b>>c;
  d=(float)c/b;
  if(d<a)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
}