#include <stdio.h>
int countInteger(int arr[],int n)
{
    int count=0;
    for(int i=0;i<n;i++)
    {
        if (arr[i]>=0)
        {
            count ++;
        }
        
    }
    return count;
}

int main()
{
  int arr[]={4,6,8,-3,6,4,2,-4,-9,1};
  printf("the +ve integers are :%d",countInteger(arr,10));

 
return 0;
}