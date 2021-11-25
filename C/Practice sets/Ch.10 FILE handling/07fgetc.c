#include <stdio.h>
int main()
{
  FILE *ptr;
 ptr= fopen("test8.txt","r");
  char c=fgetc(ptr); //initialization

  while(c!=EOF) //condition
  {
      printf("%c",c); //code to execute
      c=fgetc(ptr); //updation
  }
 
return 0;
}