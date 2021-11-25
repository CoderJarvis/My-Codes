#include <stdio.h>
int main()
{
  float income;
  printf("enter your income\n");
  scanf("%f",&income);

  float tax=0;

  if(income<2.5)
  {
      tax=0;
  }
  
  else if(income>=2.5 && income <5)
  {
      tax=income*0.05;
  }
  
 else if(income>=5 && income <10)
  {
      tax=2.5*0.05;
      tax=tax+(income-5)*0.20;
  }

  else if(income>=10)
  {
      tax=2.5*0.05;
      tax=tax+5*0.20;
      tax=tax+(income-10)*0.30;

  }

  printf("your govt tax is :%f",tax);

 
return 0;
}