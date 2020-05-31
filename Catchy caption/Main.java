#include <cstring>
#include <iostream>
using namespace std;
int main()
{
   char s[100];
  int len1,i,c=0;
  cin.getline(s,100);
  len1=strlen(s);
  for(i=0;i<len1;i++)
  {
    if(s[i]==' ')
    {
      c++;
    }
  }
  
  if(c<=10)
    cout<<"Caption eligible for the contest";
  else if(c>10)
    cout<<"Caption not eligible for the contest";
  


   
}