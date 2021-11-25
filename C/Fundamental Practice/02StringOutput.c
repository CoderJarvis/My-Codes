#include <stdio.h>

void main()
{

    char st[]="saswat kumar panda";
    char *ptr=st;
    while(*ptr != '\0')
    {
        printf("%c",*ptr);
        ptr++;
    }
    printf("\n");

    char str[]="i ll crack tcs next year";
    printf("%s",str);

}
