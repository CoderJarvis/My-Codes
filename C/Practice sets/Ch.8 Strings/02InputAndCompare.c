//gets() is used to read a multi-word string
//scanf() only can read one word of a multi word string

#include <stdio.h>

int main()
{
    char st1[50];
     char str2[40];
     int i=0;
    // printf("enter the first string\n");
    // scanf("%s",&st1);
    // printf("the entered string is : %s\n",st1);


    printf("enter the second string\n");
    char c;
    while(c!='\0');
    {
        //fflush(stdin);
        scanf("%c",&c);
        str2[i]=c;
        i++;

    }

    str2[i]='\0';
    printf("the entered string is : %s",str2);

    return 0;
}
