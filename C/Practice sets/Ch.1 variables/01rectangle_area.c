#include <stdio.h>
int main()
{
  double a;
  double b;

  double c=5.8;
  double d=7.5;

  printf("enter the length of the rectangle\n");
  scanf("%lf", &a);
  printf("enter the breadth of the rectangle\n");
  scanf("%lf", &b);
  printf("the area of the two rectangles is : %.2lf and %.2lf", a * b,c*d);

  return 0;
}
