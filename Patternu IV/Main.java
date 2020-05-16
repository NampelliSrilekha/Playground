#include <iostream>
using namespace std;
int main() {
  int i,j,n;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    if((i+1)%2==0)
    {
      for(j=1;j<n;j++)
      {
        cout<<i;
      }
      cout<<i+1<<"\n";
    }
    else
    {
      cout<<i+1;
      for(j=1;j<=n-1;j++)
      {
        cout<<i;
      }
      cout<<"\n";
    }
  }
}