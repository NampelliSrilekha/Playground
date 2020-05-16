#include<iostream>
using namespace std;
int main()
{
    int i,b,j;
    cin>>b;
  for(i=1;i<=4;i++)
  {
    for(j=1;j<=i;j++)
    {
      cout<<b;
    }
    cout<<"\n";
    b++;
  }
  b--;
  for(i=4;i>=1;i--)
  {
    for(j=1;j<=i;j++)
    {
      cout<<b;
    }
    cout<<"\n";
    b--;
  }
}