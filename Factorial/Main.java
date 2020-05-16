#include<iostream>
int fact(int n)
{
  int f=n;
  while(n>1)
  {
    return f*fact(n-1);
  }
}
int main()
{
  int n;
  std::cin>>n;
  std::cout<<"The factorial of "<<n<<" is "<<fact(n);
}