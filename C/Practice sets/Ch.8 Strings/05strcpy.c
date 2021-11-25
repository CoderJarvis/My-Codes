#include <stdio.h>
#include <string.h>
void strcopy(char st1[],char st2[] )
{
    char *ptr=st1;
    int i=0;
    while (*ptr!='\0')
    {
        st2[i]=st1[i];
       ptr++;
        i++;
    }

    st2[i]='\0';
    
}

int main()
{
  char st1[]="i ll crack tcs this year i have to start apti reasooning english very soon";
  char st2[50];
  strcopy(st1,st2);
  puts(st2);
 
return 0;
}