#include <stdio.h>

void present(char st[], char c)
{   
    int count=0;
    int flag=0;
    char *ptr = st;
    while (*ptr != '\0')
    {
        if (*ptr==c)
        {
            flag=1;
            count++;
            
        }
        ptr++;
        
    }

    if (flag)
    {
        printf("the character present in the string %d times\n",count);
    }
    else
    printf("the character is not present\n");
    
}
int main()
{
    char st[] = "saswat kumar panda";
    present(st, 's');

    return 0;
}