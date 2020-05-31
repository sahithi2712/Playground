#include<iostream>
int main()
{
 long long int n,r,count=0;
  std::cin>>n;
  do
  {
    count++;
      n=n/10;
  }
  while(n>0);
  std::cout<<count;
}
  