#include <stdio.h>
int main()
{
  int *ptr;
  ptr=(int*)malloc(5*sizeof(int));

  //now we needed more 5 integers to store

  ptr=realloc(ptr,10*sizeof(int));
 for(int i=0;i<10;i++)
 {
     printf("enter number %d element\n",i+1);
     scanf("%d",&ptr[i]);
 }
return 0;
}