#include <stdio.h>
int main()
{   
  int a;
  printf("enter a number\n");
  scanf("%d",&a);
  int arr[10];
  for(int i=0;i<10;i++)
  {
      arr[i]=a*(i+1);
  }
 
 for (int i = 0; i <10; i++)
 {
    printf("%d * %d =%d\n",a,i+1,arr[i]);
 }
 
return 0;
}