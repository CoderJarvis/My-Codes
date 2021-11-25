#include <stdio.h>
int main()
{
   int *ptr;
  ptr=(int*)malloc(10*sizeof(int));
  int n=7;
  for(int i=0;i<10;i++)
  {
      ptr[i]=n*(i+1);
  }

  for(int i=0;i<10;i++)
  {
      printf("%d X %d = %d\n",n,i+1,ptr[i]);
  }
  printf("\n");
 
    ptr=realloc(ptr,15*sizeof(int));
      for(int i=0;i<15;i++)
  {
      ptr[i]=n*(i+1);
  }
   for(int i=0;i<15;i++)
  {
      printf("%d X %d = %d\n",n,i+1,ptr[i]);
  }
 

return 0;
}