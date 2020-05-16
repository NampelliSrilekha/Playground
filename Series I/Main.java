#include<iostream>
using namespace std;
int main()
{
  int n,i;
  float k=0.5;
  cin>>n;
  cout<<k<<" ";
  for(i=1;i<n;i++)
  {
    k=k*3.0;
    cout<<k<<" ";
  }
}