#include<iostream>
using namespace std;
int main()
{
  int n;
  float m;
  cin>>n>>m;
  switch(n)
  {
    case 1:cout<<float(m);
      break;
    case 2:cout<<float(m+(m*50/100));
      break;
    case 3:cout<<float(m+m);
      break;
    default:cout<<"Number of items is more";
      break;
  }
}