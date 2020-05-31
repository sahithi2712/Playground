#include<iostream>
using namespace std;
int main()
{
int n,i;
cin>>n;
int a[n];
for(i=0;i<n;i++)
{
    cin>>a[i];
}
int c=0,d=0;
for(i=0;i<n;i++)
{
    if(a[i]%2==0)
    c=c+a[i];
    else if(a[i]%2!=0)
    d=d+a[i];
}
cout<<"The sum of the even numbers in the array is "<<c<<"\n";
  cout<<"The sum of the odd numbers in the array is "<<d;
}