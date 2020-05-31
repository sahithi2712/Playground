#include<iostream>
using namespace std;
int main()
{
  int r,c,a[10][10],max,i,j;
  cin>>r>>c;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  max=a[0][0];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      if(max<a[i][j])
        max=a[i][j];
    }
  }
  cout<<"The maximum element is "<<max;

}