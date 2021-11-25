#include <stdio.h>
typedef struct  employee
{
    char name[20];
    int salary;
}emp;


int main()
{  
     emp e1[2];
for(int i=0;i<2;i++)
{
    printf("enter the name of employess %d\n",i+1);
    scanf("%s",&e1[i].name);
    printf("enter the salary of the employess %d\n",i+1);
    scanf("%d",&e1[i].salary);
    FILE *ptr;
    ptr=fopen("test5.txt","w");
    fprintf(ptr,"%s,%d\n",e1[0].name,e1[0].salary);
    fprintf(ptr,"%s,%d\n",e1[1].name,e1[1].salary);



}

 
return 0;
}