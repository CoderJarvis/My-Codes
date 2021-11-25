#include <stdio.h>
int main()
{
  int s1,s2,s3;
  printf("enter your marks\n");
  scanf("%d",&s1);
  scanf("%d",&s2);
  scanf("%d",&s3);

  if(s1<33 || s2<33 ||s3<33 || (s1+s2+s3)/3<40)
  {
      printf("he is fail\n");
  }

  else
  printf("you are pass");

 
return 0;
}