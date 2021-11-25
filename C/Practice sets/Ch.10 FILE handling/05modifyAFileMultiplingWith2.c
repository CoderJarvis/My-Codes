#include <stdio.h>
int main()
{
  FILE *ptr;
  int n1;
  ptr=fopen("test6.txt","r");
  fscanf(ptr,"%d",&n1);
  ptr=fopen("test7.txt","w");
  fprintf(ptr,"%d",2*n1);
 
return 0;
}