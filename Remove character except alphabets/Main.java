#include<bits/stdc++.h>
using namespace std;
int main()
{
  string s;
  int i;
  cin>>s;
  for(i=0;i<s.size();i++)
  {
    if((s[i]<'a' || s[i]>'z') && (s[i]<'A' || s[i]>'Z'))
    {
      s.erase(i,1);
      i--;
    }
  }
  cout<<s;
  
}