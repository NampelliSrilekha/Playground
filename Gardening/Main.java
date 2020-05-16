#include<iostream>
using namespace std;
int main()
{
  int i,j,t;
  cin>>i>>j>>t;
  if(t>j+1 && t<=j*2)
    cout<<"It is a mango tree";
  else if(t>j*(i-2) && t<=j*(i-1))
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
}