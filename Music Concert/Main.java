#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  int n,c=0,d=0,i;
  int *p;
  cin>>n;
  p=(int *)malloc(n*sizeof(int));
  for(i=0;i<n;i++)
  {
    cin>>*(p+i);
  }
  for(i=0;i<n;i++)
  {
    if(*(p+i)%2==0)
    {
      c++;
    }
    else if(*(p+i)%2!=0)
    {
      d++;
    }
  }
  cout<<d<<"\n"<<c;
    
      
  
  return 0;
}