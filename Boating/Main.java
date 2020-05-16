#include<iostream>
using namespace std;
int main()
{
  int w,a,c,l1,l2;
  std::cin>>w>>a>>c;
  l1=a*75;
  l2=c*30;
  if((l1+l2)<w)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}