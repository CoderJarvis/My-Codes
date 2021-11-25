#include <stdio.h>
int main()
{
  int *ptr;
  ptr=(int*)malloc(6*sizeof(int));

  for(int i=0;i<6;i++)
  {
      printf("enter %d number in the array\n",i+1);
      scanf("%d",&ptr[i]);
  }
 
return 0;
}