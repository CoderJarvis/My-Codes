#include <stdio.h>
int main()
{
  FILE *ptr;
  int n1,n2,n3;
  ptr=fopen("test1.txt","r");
  fscanf(ptr,"%d",&n1);
  fscanf(ptr,"%d",&n2);
  fscanf(ptr,"%d",&n3);

   printf("the first integer is :%d\n the second integer is :%d\nthe third integer is :%d\n",n1,n2,n3);


return 0;

}