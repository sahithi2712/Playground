#include<iostream>
using namespace std;
int main()
{
  int n,a[100],i,j,temp;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
 for(i = 1;i < n; ++i)
    {
       if(a[0] < a[i])
           a[0] = a[i];
    }
    cout <<a[0];

    return 0;
        
    
}