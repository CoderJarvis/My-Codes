#include <stdio.h>
int main()
{
  printf("enter the year\n" );
  int year;
  scanf("%d",&year);

    if(year %400==0 ||  year % 4==0 && year % 100!=0)
    {
        printf("its a leap year");
    }
    
    else
    printf("its not a leap year");
 
return 0;
}