#include<iostream>
using namespace std;
int swap(int &a, int &b)
{
  int t;
  t=a;
  a=b;
  b=t;
}
int main()
{
  int x,y;
  cin>>x>>y;
  cout<<"Before swapping a= "<<x<<" and b="<<y<<"\n";
  swap(x,y);
  cout<<"After swapping a= "<<x<<" and b="<<y;
}
 