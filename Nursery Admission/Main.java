#include<iostream>
using namespace std;
int main()
{
  std::string str;
  cin>>str;
  int c;
  for(int i=0;str[i]!='\0';i++)
  {
    c+=1;
  }
  cout<<"The number of letters in the name is "<<c;
}