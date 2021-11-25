#include <stdio.h>
int main()
{
  char c;
  printf("enter a character\n");
  scanf("%c",&c);
 // printf("%d",(int)c);

  if((int)c>=97 && (int)c<=122)
  printf("its a lower case");

  else if((int)c >=65 && (int)c<=90)
  printf("its an upper case");
  else
  printf("something else");
 

return 0;
}