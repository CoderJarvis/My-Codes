#include <stdio.h>
struct  vector
{
    int x;
    int y;
};

int main()
{
  struct  vector v1,v2;
  v1.x=10;
  v1.y=30;

  v2.x=22;
  v2.y=33;
  
  printf("printing the vector v1 values\n");
  printf("x=%d\ny=%d\n",v1.x,v1.y);

  printf("printing the vector v2 values\n");
  printf("x=%d\ny=%d",v2.x,v2.y);
  
  printf("\nthis is uses of structure\n");
 
return 0;
}