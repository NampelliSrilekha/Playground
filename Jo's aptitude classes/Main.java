#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,i;
  cin>>a>>b>>c>>d;
  if(a<b && a<c)
    i=a;
  else if(b<c && b<a)
    i=b;
  else
    i=c;
  while(i>1)
  {
    if(a%i==0 && b%i==0 && c%i==0)
    {
      break;
    }
    i--;
  }
  if(i==d)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}    