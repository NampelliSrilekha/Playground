#include<iostream>
#include <bits/stdc++.h>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
    std::cout<<" ";
  }
  int m=sizeof(a)/sizeof(a[0]);
  sort(a,a+m);
  cout<<a[n-1];
}