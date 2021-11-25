#include <stdio.h>

void reverseArray(int arr[],int n)
{   
    printf("\nthe reversed array is ");
    for(int i=n-1;i>=0;i--)
    {
        printf("%d ",arr[i]);
    }
}
int main()
{
  int arr[]={10,20,30,15,25};
  printf("the original array is ");
  for(int i=0;i<5;i++)
  {
      printf("%d ",arr[i]);
  }
  reverseArray(arr,5);
 
return 0;
}