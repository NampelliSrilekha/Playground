#include<iostream>
#include<math.h>
using namespace std;
int arm(int, int);
int main()
{
    int count=0,temp,num,t;
    cin>>num;
    temp=num;
    while(temp>0)
    {
        t=temp%10;
        temp=temp/10;
        count=count+1;
    }
    arm(num,count);
}
int arm(int num,int count)
{
    int t, sum=0;
    int temp=num;
    while(temp>0)
    {
        t=temp%10;
        sum=sum+pow(t,count);
        temp=temp/10;
    }
    if (sum==num)
        cout<<"Kindly proceed with encrypting";
    else
        cout<<"It is not an Armstrong number";
}