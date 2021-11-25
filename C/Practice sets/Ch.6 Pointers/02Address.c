#include <stdio.h>
void address(int x)
{
    int *ptr=&x;
 printf("the addres of x is :%u",ptr);

}

//both will be differnt because x is the copy of the k variable
int main()
{
  int k;
  int *p=&k;
  printf("the addres of k is :%u\n",p);

  address(k);
 
return 0;
}