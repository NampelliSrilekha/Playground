#include<iostream>
using namespace std;
int main()
{
  int a,b,n,s=0;
  cin>>a>>b;
  n=a+b;
  //cout<<n;
  int i;
  for(i=1;i<n;i++)
  {
    if(n%i==0)
    {
      s=s+i;
    }
  }
  //cout<<s;
  if (s==n)
	cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}