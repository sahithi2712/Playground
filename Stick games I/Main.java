

#include<iostream>
using namespace std;
void print (int a,int b)
{
  if((a+b)%2==0)
  {
    cout<<"Mani Iyer";
  }
else if((a+b)%2!=0)
{
  cout<<"Arun Gupta";
}
}
  
int main()
{
 int m,n;
 cin>>m;
 cin>>n;
 print(m,n);
 
 
  
}