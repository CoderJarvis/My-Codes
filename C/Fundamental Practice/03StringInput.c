#include <stdio.h>

int main()
{

 //   char str[50];
 //   printf("enter the string\n");
 //   scanf("%s",str); //scanf prints the first word of the input string
  //  printf("%s\n",str);//so use gets and puts for solution //p-prin-->puts=print //g-i(close)-->g==i-->gets==input

    char str1[50];
    printf("enter your string\n");
    gets(str1);
  //  puts(str1);//put has no agruments
    printf("your entered string is %s\n",str1); //for readiablity use this printf and %s


    return 0;
}
