#include<iostream>
using namespace std;
int main()
{
  int a,c=0;
  cin>>a;
  do
   {
      c++;
      a=a/10;
    }
  while(a>0);
  cout<<c;
}