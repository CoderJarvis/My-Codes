#include <stdio.h>
#include<stdio.h>
int strlen(char st[20]){
    char *ptr = st;
    int len=0;
    while(*ptr!='\0'){
        len++;
        ptr++;
    }
    return len;
}
int main()
{
  
    char str[50];
    printf("enter the string u want to search\n");
    gets(str);
   
    int a=strlen(str);
    printf("the length odf the srting is %d",a);

 
return 0;
}