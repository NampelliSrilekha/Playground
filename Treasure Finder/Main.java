#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
  int a,b,c,d[3],i,j,code,f;
  cin>>a>>b>>c;
  
  d[0]=a;
  d[1]=b;
  d[2]=c;
  for(i=1;i<=a && i<=b && i<=c;i++)
  {
    if(a%i==0 && b%i==0 && c%i==0)
      code=i;
  }
  for (i = 0; i < 3; i++)
    {
        for (j = i + 1; j < 3; j++)
        {
            if (d[i] < d[j])
            {
                f = d[i];
                d[i] = d[j];
                d[j] = f;
            }
        }
  }
  cout<<"The treasure is in box which has number "<<d[1]<<"\n";
  cout<<"The code to open the box is "<<code;
}