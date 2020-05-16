#include<iostream>
#include<string>
using namespace std;
struct emp
{
  string name;
  int eid;
  int age;
  string des;
  float sal;
};
int main()
{
  struct emp e;
  cout<<"Enter name:\n";
  cin>>e.name;
  cout<<"Enter ID:\n";
  cin>>e.eid;
  cout<<"Enter age:\n";
  cin>>e.age;
  cout<<"Enter designation:\n";
  cin>>e.des;
  cout<<"Enter Salary:\n";
  cin>>e.sal;
  cout<<"Employee Details\n";
  cout<<"Name of the Employee : "<<e.name<<"\n";
  cout<<"ID of the Employee : "<<e.eid<<"\n";
  cout<<"Age of the Employee : "<<e.age<<"\n";
  cout<<"Designation of the Employee : "<<e.des<<"\n";
  cout<<"Salary of the Employee : "<<e.sal;
}