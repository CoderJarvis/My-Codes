#include <stdio.h>
int main()
{
  FILE *ptr;
  ptr=fopen("test8.txt","w");

  fputc('I',ptr);
  fputc(' ',ptr);
  fputc('l',ptr);
  fputc('l',ptr);
  fputc(' ',ptr);
  fputc('c',ptr);
  fputc('r',ptr);
  fputc('a',ptr);
  fputc('c',ptr);
  fputc('k',ptr);
  fputc(' ',ptr);
  fputc('T',ptr);
  fputc('C',ptr);
  fputc('S',ptr);
  fputc(' ',ptr);
  fputc('t',ptr);
  fputc('h',ptr);
  fputc('i',ptr);
  fputc('s',ptr);
  fputc(' ',ptr);
  fputc('y',ptr);
  fputc('e',ptr);
  fputc('a',ptr);
  fputc('r',ptr);
  
  fclose(ptr);
 
return 0;
}