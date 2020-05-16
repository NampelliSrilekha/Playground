#include<iostream>
using namespace std;
int main()
{
  int num,count=0;
  cin>>num;
  int e,f;
  cout<<num<<"\n";
  while(num>1)
  {
    if(num%2==0)
    {
      e=num/2;
      cout<<e<<"\n";
      num=e;
    }
    else
    {
      f=3*num+1;
      cout<<f<<"\n";
      num=f;
    }
    count++;
  } 
  cout<<count;
}