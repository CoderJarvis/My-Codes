#include <stdio.h>
int main()
{
  int a=10;
  int *p=&a;
  printf("the addres of the variable a is :%u\n",&a);
  printf("the addres of the variable a is :%u\n",p);
   //& address of operator

  printf("the value present at this variable is:%d\n",*(&a));
  printf("the value present at this variable is:%d",*p);
  //* value at operator
 
return 0;
}