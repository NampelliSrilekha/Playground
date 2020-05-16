#include<iostream>
using namespace std;
int main()
{
  float l=0.0,b,count=0.0;
  int i,j,a[10];
  for(i=0;;i++)
  {
    cin>>a[i];
    l++;
    if(a[i]%2!=0 && a[i]>0)
      count++;
    if(count==3 || a[i]<0)
      break;
    else
      continue;
  }
  //cout<<"count:"<<count<<" l:"<<l<<"\n";
  if(count==l)
      cout<<float(count);
  else
  {
  	for(j=0;j<=l;j++)
  	{
    	if(a[j]%2==0 && a[j]>0)
      		count=count-0.5;
      	//else if(a[j]%2!=0)
      	    //b=b+1;
    	else if(a[j]<0)
      		count=count-1;
        else
            continue;
  	}
  	cout<<count;
  }
}
