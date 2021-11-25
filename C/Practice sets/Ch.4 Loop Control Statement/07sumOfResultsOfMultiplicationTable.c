#include <stdio.h>
int main()
{
  
  int sum=0;
  int n=10;

  for(int i =1;i<=10;i++)
  {
      sum=sum+n*i;
  }

  printf("the total sum is :%d",sum);
 
return 0;
}