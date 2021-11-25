#include <stdio.h>
void encrypt(char st[])
{
    char *ptr=st;
    while (*ptr!='\0')
    {
        *ptr=*ptr-1;
        ptr++;
    }
    
}

int main()
{
  char st[]="nz!qbttxpse!jt!;!296:53";
  printf("the encrypted string is : %s\n",st);
  encrypt(st);
  printf("the decrypted string is : %s\n",st);
 
return 0;
}