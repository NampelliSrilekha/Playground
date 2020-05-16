#include<iostream>
using namespace std;
int main()
{
    int a,b,c,d,e,f,g;
    int bonus, bonusrate, s1,s2,s3,s4,s5,s6,s7,s8 = 0;
    int edays, totdays, totrate;
    cin>>a;
    cin>>b;
    cin>>c;
    cin>>d;
    cin>>e;
    cin>>f;
    cin>>g;
    s1=a*150;
    s7=g*125;
    if(b <= 8)
    {
        s2=b*100;
    }
    else if(b>8)
    {
        bonus=b-8;
        bonusrate=bonus*115;
        s2 = bonusrate+800;
    }
    if(c<=8)
    {
        s3=c*100;
    }
    else if(c>8)
    {
        bonus=c-8;
        bonusrate=bonus*115;
        s3=bonusrate+800;
    }
    if(d<=8)
    {
        s4=d*100;
    }
    else if(d>8)
    {
        bonus=d-8;
        bonusrate=bonus*115;
        s4=bonusrate+800;
    }
    if(e<=8)
    {
        s5=e*100;
    }
    else if(e>8)
    {
        bonus=e-8;
        bonusrate=bonus*115;
        s5=bonusrate+800;
    }
    if(f<=8)
    {
        s6=f*100;
    }
    else if(f>8)
    {
        bonus=f-8;
        bonusrate=bonus*115;
        s6=bonusrate+800;
    }
    totdays=b+c+d+e+f;
    if(totdays>40)
    {
        edays=totdays-40;
        s8=edays*25;
    }
    totrate=s1+s2+s3+s4+s5+s6+s7+s8;
    cout<<totrate;
    
}