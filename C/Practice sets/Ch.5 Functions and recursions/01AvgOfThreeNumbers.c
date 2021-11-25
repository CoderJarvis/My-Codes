#include <stdio.h>
float averager(int a,int b,int c )
{
    return (a+b+c)/3.0;
}


int main()
{
  int a=17,b=54,c=45;

  printf("the av of the thre numbers is :%.2f",averager(a,b,c));
 
 return 0;
}

