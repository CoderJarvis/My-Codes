#include <stdio.h>
int main()
{
  FILE *ptr;
  FILE *ptr2;
  char c;
  ptr=fopen("test3.txt","r");
  ptr2=fopen("test4.txt","w");
   c=fgetc(ptr);    //initialization //extracting character from ptr(test3.txt)
  while (c!=EOF)
  {
      fputc(c,ptr2); //writing into another file(test4.txt) twitce of a character
      fputc(c,ptr2);

      c=fgetc(ptr); //increment
  }


return 0;
}