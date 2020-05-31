#include <iostream>
#include<string.h>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
   struct student s1;
  cin.getline(s1.name,50);
  cin>>s1.roll>>s1.marks;
  cout<<"\n"<<"Student Details"<<"\n"<<"Name: "<<s1.name<<"\n"<<"Roll: "<<s1.roll<<"\n"<<"Marks: "<<s1.marks;
  return 0;
}