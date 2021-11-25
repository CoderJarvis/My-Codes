#include <stdio.h>

float force(float mass)
{
    return mass*9.8;
}
//f=mg
int main()
{
  printf("enter the mass of the body\n");
  float mass;
  scanf("%f",&mass);

  printf("the force of attraction would be %.2f",force(mass));
 
return 0;
}