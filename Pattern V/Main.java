#include<iostream> 
using namespace std; 
int main() 
{ 
    int n,k,i,j,l=1,r; 
    cin>>n;
	r=n*n+1; 
	for (i=n;i>0;i--) 
	{ 
		for (k=n;k>i;k--) 
			cout<<"--"; 
		for (j=1;j<=i;j++) 
		{ 
			cout<<l; 
			cout<<"*"; 
			l++; 
		} 
		for (j=1;j<=i;j++) 
		{ 
			cout<<r; 
			if (j<i) 
				cout<<"*"; 
			r++; 
		} 
		r = r-(i-1)*2-1; 
		cout <<"\n"; 
	} 
}