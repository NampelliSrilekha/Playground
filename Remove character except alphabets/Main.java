#include<iostream>
using namespace std;
int main()
{
  std::string str;
  cin>>str;
  for(int i=0;str[i]!='\0';i++)
  {
    if(str[i]>96 && str[i]<123 || str[i]>64 && str[i]<91)
      cout<<str[i];
    else
      continue;
  }
}