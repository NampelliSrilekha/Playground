#include<iostream>
#include<cstring>
using namespace std;
struct stud
{
     char name[50];
     char add[50];
     int es;
     float pp;
}s[100];
int main()
{
     struct stud t;
     int i=0,j=0,n;
     cout<<"Enter the number of colleges";
     std::cin>>n;
     for(i=0;i<n;i++)
     {
          cout<<"\nEnter the details of college "<<i+1;
          cout<<"\nEnter name";
          std::cin>>s[i].name;
          cout<<"\nEnter city";
          std::cin>>s[i].add;
          cout<<"\nEnter year of establishment";
          std::cin>>s[i].es;
          cout<<"\nEnter pass percentage";
          std::cin>>s[i].pp;
     }
      cout<<"\nDetails of colleges";
     for(i=0;i<n;i++)
     {
       std::cout<<"\nCollege:"<<i+1;
          std::cout<<"\nName:"<<s[i].name;          
          std::cout<<"\nCity:"<<s[i].add;
          std::cout<<"\nYear of establishment:"<<s[i].es;
          std::cout<<"\nPass percentage:"<<s[i].pp;
     }     return 0;
}