#include<iostream>
using namespace std;
int main()
{
  int a=6,b=5,i,n;
  cin>>n;
  cout<<a<<" ";
  for(i=1;i<n;i++)
  {
    a=a+b;
    b=b+5;
    cout<<a<<" ";
  }
}
  