#include <stdio.h>

int fiboSum(int n)
{
    if ((n==1))
    return 1;

    else
    {
       return n+fiboSum(n-1); 
    }
    
}
int main()
{
  int n=10;

  printf(" the sum of %d natural number is : %d",n,fiboSum(n));


 
return 0;
}