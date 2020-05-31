#include<iostream>
using namespace std;
int main()
{
  int n,i,flag=0,flag1=0;
  cout<<"Enter the number of elements in the array"<<"\n";
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array"<<"\n";
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
    flag++;
    else if(a[i]%2!=0)
      flag1++;
  }
  if(flag==n)
    cout<<"The array is Even";
    else if(flag1==n)
    cout<<"The array is Odd";
    else 
    cout<<"The array is Mixed";
  
}