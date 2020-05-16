#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  float e,f,i,j,p,q,s;
  e=a/6;
  i=(float)(d%6)/10;
  f=(d/6)+i;
  j=c/f;
  p=round(j*10)/10;
  q=b/float(e);
  s=round(q*10)/10;
  cout<<e<<"\n";
  cout<<f<<"\n";
  cout<<p<<"\n";
  cout<<s<<"\n";
  if(p>s)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
}