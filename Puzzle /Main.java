#include<iostream>
using namespace std;
int main()
{
int i,j,r,c,a[100][100];
  cin>>r>>c;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
 
  for(i=0;i<c;i++)
  {
    for(j=0;j<r;j++)
    {
      cout<<a[j][i]<<" ";
    }
    cout<<"\n";
  }
  }     