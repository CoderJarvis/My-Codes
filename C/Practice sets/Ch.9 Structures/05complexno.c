#include <stdio.h>

typedef struct complex
{
    int real;
    int imaginary;

}comp;
int main()
{
  comp n1;
  printf("enter the real value of the complex number\n");
  scanf("%d",&n1.real);
  printf("enter the imaginary value of the complex number\n");
  scanf("%d",&n1.imaginary);

  printf("so the complex number is : %d + %di",n1.real,n1.imaginary);
 
return 0;
}