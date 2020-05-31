#include<iostream> 
using namespace std;
int main() 
{
  int y1,y2;
  cin>>y1>>y2;
  if(y1>y2) 
  {
    y1 = y1 +900 ;
    y2 = y2+1000;
  }
  else
  {
    y1 = y1+1000;
    y2 = y2 +1000;
  }
  cout<<y2-y1;
}