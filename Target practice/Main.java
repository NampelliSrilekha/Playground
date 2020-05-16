#include<iostream>
using namespace std;
int main()
{
  int k,n,p=0,count=0;
  cin>>k;
  while(p<k)
  { 
    cin>>n;
    count++;
    p=p+n;
   
    if(p<k)
      continue;
      
  }
  if(p>=k)
     cout<<"The number of turns is "<<count;
  
}