#include<iostream>
using namespace std;
int main()
{
  int i,j,k,n;
  cin>>i>>j>>n;
  if(n>=1 && n<=j)
    cout<<"Yes";
  else if(n%j==0)
    cout<<"Yes";
  else if((n-1)%j==0)
 	cout<<"Yes";
  else
    cout<<"No";
}