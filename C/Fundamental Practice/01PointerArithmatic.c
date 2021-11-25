#include <stdio.h>
int main()
{
  int a=10;
  int *p=&a;

 // printf("address of a= %u\n",&a);
  printf("address of Integer Pointer p= %u\n",p);
  printf("address of Integer Pointer p= %u\n",p+1);
  printf("address of Integer Pointer p= %u\n",p+2);
  printf("address of Integer Pointer p= %u\n",p+3);
  //integer pointer so each increment it adds 4
    printf("\n");
  char c="A";
  char *p1=&c;
   printf("address of Character Pouinter c= %u\n",p1);
   printf("address of Character Pouinter c= %u\n",p1+1);
   printf("address of Character Pouinter c= %u\n",p1+2);
   printf("address of Character Pouinter c= %u\n",p1+3);
   printf("\n");
//character pointerso each time adds 1

double d1;
int *p2=&d1;
printf("address of Double Pointer d1= %u\n",p2);
printf("address of Double Pointer d1= %u\n",p2+1);
printf("address of Double Pointer d1= %u\n",p2+2);
printf("address of Double Pointer d1= %u\n",p2+3);

 
return 0;
}