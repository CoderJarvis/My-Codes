#include <stdio.h>
void encrypt(char st[])
{
    char *ptr=st;
    while (*ptr!='\0')
    {
        *ptr=*ptr+1;
        ptr++;
    }
    
}

int main()
{
  char st[]="my password is : 185942";
  printf("the original string is : %s\n",st);
  encrypt(st);
  printf("the encrypted string is : %s\n",st);
 
return 0;
}