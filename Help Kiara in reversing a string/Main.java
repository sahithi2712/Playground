#include<iostream>
using namespace std;
int main()
{
  char s[100],r[100];
  cin.getline(s,100);
  int c=0,begin,end;
  while(s[c]!='\0')
  {
    c++;
  }
 
  end=c-1;
  for(begin=0;begin<c;begin++)
  {
    r[begin]=s[end];
    end--;
  }
 cout<<r;
}
  