#include <stdio.h>
int main()
{
  int n=14;

  int f=1;

//   for(int i=2;i<=n/2;i++)
//   {
//       if(n%i==0)
//     {  f=0;
//       break;
//     }
//   }
//   if(f){
//       printf("prime");

//   }
//  else
//  printf("not prime");
 int i=2;
  while(i<n/2)
  {
      if (n%i==0)
      {
          f=0;
          break;
                      /* code */
      }
      i++;
      
  }

  if(f){
      printf("prime");

  }
 else
 printf("not prime");
 
return 0;
}