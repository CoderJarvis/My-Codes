#include <stdio.h>
#include <string.h>
struct date
{
    int date;
    char month[10];
    int year;
    char day[20];
};

int main()
{
   struct date d1;
  printf("enter the date\n");
  scanf("%d",&d1.date);
  printf("enter the month\n");
  scanf("%s",&d1.month);
  printf("enter the year\n");
  scanf("%d",&d1.year);
  printf("enter the day\n");
  scanf("%s",d1.day);
 
printf("your entered date is %d/%s/%d and its %s\n",d1.date,d1.month,d1.year,d1.day);

return 0;
}