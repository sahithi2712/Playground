#include<iostream>
using namespace std;
int main()
{
  int n,m,a[10][10];
  cin>>n>>m;
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<m;j++)
    {
      cin>>a[i][j];
    }
  }
 for (int i = 0; i <m; i++) { 
        // initialize the maximum element 
        // with 0 
        int maxm = a[0][i]; 
  
        // Run the inner loop for rows 
        for (int j = 1; j <n; j++) { 
            // check if any element is greater  
            // than the maximum element 
            // of the column and replace it 
            if (a[j][i] > maxm) 
                maxm = a[j][i]; 
        } 
  
        // print the largest element of the column 
        cout << maxm <<"\n";
    } 
} 
  