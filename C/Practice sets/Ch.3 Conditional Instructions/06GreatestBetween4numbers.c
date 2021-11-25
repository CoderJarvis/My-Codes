#include <stdio.h>
int main()
{
  printf("enter 4 numbers\n");
  int n1,n2,n3,n4;
  scanf("%d",&n1);
  scanf("%d",&n2);
  scanf("%d",&n3);
  scanf("%d",&n4);

  if(n1>n2>n3>n4)
  printf("greater is:%d",n1);

  else if(n2>n3>n4)
    printf("greater isd :%d",n2);

    else if(n3>n4)
    printf("graeter is : %d",n3);
    else
    printf("greater is :%d",n4);
 
return 0;
}