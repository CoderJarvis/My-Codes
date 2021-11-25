#include <stdio.h>


float fahen(float a)
{
  return 1.8*a+32;
}

int main()
{
  float a=37.5;
  float b=fahen(37.5);
  printf("in farenhite it will be %.2f",b);

return 0;
}