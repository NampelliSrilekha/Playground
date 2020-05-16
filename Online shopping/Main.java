#include<iostream>
using namespace std;
int main()
{
  int a,b,c,p,q,r,x,y,z;
  int i,j,m;
  std::cin>>a>>b>>c;
  std::cin>>p>>q>>r;
  std::cin>>x>>y>>z;
  i=a-((a*b)/100)+c;
  j=p-((p*q)/100)+r;
  m=x-((x*y)/100)+z;
  cout<<"In Flipkart Rs."<<i;
  cout<<"\nIn Snapdeal Rs."<<j;
  cout<<"\nIn Amazon Rs."<<m;
  if(i<=j && i<=m)
    cout<<"\nHe will prefer Flipkart";
  else if(j<i && j<=m)
    cout<<"\nHe will prefer Snapdeal";
  else if(m<i && m<j)
    cout<<"\nHe will prefer Amazon"; 
}