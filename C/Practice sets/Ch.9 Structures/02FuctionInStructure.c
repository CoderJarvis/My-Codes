#include <stdio.h>
struct vector
{
    int x;
    int y;
};

struct vector sumVector(struct vector v1,struct vector v2)
{
    struct vector resultV3;
    resultV3.x=v1.x+v2.x;
    resultV3.y=v1.y+v2.y;

    return resultV3;
}

int main()
{
  struct vector v1,v2,sum;
  v1.x=11;
  v1.y=22;

  v2.x=44;
  v2.y=66;
  printf("values of vector v1\n");
  printf("x=%d\ny=%d\n",v1.x,v1.y);
  
  printf("values of vector v2\n");
  printf("x=%d\ny=%d\n",v2.x,v2.y);

  sum=sumVector(v1,v2);
  printf("the summation is\n");
  printf("the result of vector-1 x + vector-2 x :%d\n",sum.x);
printf("the result of vector-1 y + vector-2 y :%d\n",sum.y);

return 0;
}