#include<iostream>
using namespace std;
int main()
{
  int n,k,i,j=0;
  cin>>n;
  int a[n];
  for (int i;i<n;i++)
  {
    cin>>a[i];
  }
  cin>>k;
  for(i=0;i<n;i++)
  {
    if(a[i]==k)
    {
      j=j+1;
    }
  }
  if(j==1)
    cout<<"She passed her exam";
  else
    cout<<"She failed";
}