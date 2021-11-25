#include <stdio.h>
int occurance(char st[],int n)
{
    int c=0;
    char *ptr=st;
    while (*ptr!='\0')
    {
        if(*ptr==n)
            c++;    
    }
    return c; 
    
}

int main()
{
  char str[]="s77asw77at77";
  int a=occurance(str,7);
  printf("the occurance is :%d",a);
 
return 0;
}