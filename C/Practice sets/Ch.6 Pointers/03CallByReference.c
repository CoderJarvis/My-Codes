#include <stdio.h>

int change(int *x)
{
    *x=*x*10;
    return *x;
}
int main()
{
  int n=5;
  printf("before call the value is %d\n",n);
  printf("the changed values is %d",change(&n));
 
return 0;
}