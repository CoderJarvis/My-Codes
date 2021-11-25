#include <stdio.h>
int fibonacci(int term)
{
    if(term==1)
    return 0;
    else if (term ==2)
    return 1; 
    else
    return fibonacci(term-1) + fibonacci(term-2);
}

int main()
{
  printf("enter which term u want to know\n");
  int term;
  scanf("%d",&term);

  int c=fibonacci(term);
  printf("%d",c);

 
return 0;
}