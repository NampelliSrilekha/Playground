#include <iostream>
#include<string>
using namespace std;
struct student
{
    string name;
    int roll;
    float marks;
};
int main() 
{
  struct student s;
  getline(cin,s.name);
  cin>>s.roll;
  cin>>s.marks;
  cout<<"\nStudent Details"<<"\n";
  cout<<"Name: "<<s.name;
  cout<<"\nRoll: "<<s.roll;
  cout<<"\nMarks: "<<s.marks;
}