#include <stdio.h>
int main()
{
  FILE *ptr;
  int n1;
  ptr=fopen("test2.txt","w");
  printf("enter the number which u want to see its multiplication table\n");
  scanf("%d",&n1);

  for(int i=1;i<=10;i++)
  {
      fprintf(ptr,"%d X %d = %d\n",n1,i,n1*i);
  }

 
return 0;
}