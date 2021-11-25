//q3 ans is array because all the variables are in similar datatyp
//if disimilar datatypes are there,then we should use structures

#include <stdio.h>
#include<string.h>

struct employee
{
    int code;
    char name[20];
    float sal; //in lakhs (annual)
};

int main()
{
  struct employee e1,e2,e3;
  struct employee *ptr;

  ptr=&e1;

    ptr->code=30;
    ptr->sal=3.5;
    strcpy(ptr->name,"saswat panda");

    printf("the employees's code is :%d\n",ptr->code);
    printf("the employees's name is :%s\n",ptr->name);
    printf("the employees's salary is :%.2f lakhs\n",ptr->sal);
    
    
 
return 0;
}