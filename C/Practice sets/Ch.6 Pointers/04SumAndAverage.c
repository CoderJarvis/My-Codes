#include <stdio.h>
int sum(int *x,int *y)
{
    return *x+*y;
}

float avg(int *x,int*y)
{
    return (*x+*y)/2.0;
}
int main()
{
  int n1=9,n2=20;

  printf("the sum is :%d\n",sum(&n1,&n2));
  printf("the average is :%.2f",avg(&n1,&n2));
 
return 0;
}