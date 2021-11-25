#include <stdio.h>
int main()
{
  int a=3;

  printf("%d %d %d \n",a,++a,a++);
  //    3 4 4 -->thi is wrong
  //in GCC compiler agruments of printf function are paassed from right to left
  //if interviewer askd this question i have to ask him what is the behaviour of the printf function,is it GCC compiler or not
  //so here the correct output is 
  //a++=3 ++a=5 a=5 //  5   5   3   (from right u hv to calculate)
 
return 0;
}