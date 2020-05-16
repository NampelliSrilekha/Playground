#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
	std::string fnum;
	cin>>fnum;
  int n;
  n=fnum.find(".");
  cout<<"Floating part is : ";
  if(n>0)
  {
    for(int i=n+1;fnum[i]!='\0';i++)
    {
      cout<<fnum[i];
    }
  }
}