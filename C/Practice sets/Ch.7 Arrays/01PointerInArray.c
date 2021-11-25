#include <stdio.h>
int main()
{
  int arr[]={10,30,50,20,40};
  int *ptr=arr;

  printf("address of first element :%u\n",&arr[0]);
  printf("poiner points to the location %u",ptr);
  //so pointer alwys points to the first element of the array
  printf("\n");

  printf("the 3rd value through pointer is %d",*(ptr+4));
  //so through pinter we can acess all elemens of an array in constant time

    //int arr[3];
    //int *p=arr;
    //the value of *(p+3) == arr[3]   ??????
    //it is false
    //ptr->points to the first element
    //ptr+1->points to the second element
    //ptr+2->points to the third elememt
    //ptr+3->value not present in the array



 
return 0;
}