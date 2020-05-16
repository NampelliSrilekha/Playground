#include <iostream>
using namespace std;
int main()
{
    int i,j,n;
    cin>>n;
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=i;)
        {
            cout<<i;
            j++;
            if(j<=i)
              cout<<"*";
            else
              continue;
        }
        cout<<"\n";
    }
    for(i=n;i>=1;i--)
    {
        for(j=1;j<=i;)
        {
            cout<<i;
            j++;
            if(j<=i)
              cout<<"*";
            else
              continue;
        }
        cout<<"\n";
    }
}