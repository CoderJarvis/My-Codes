#include <stdio.h>

struct complex
{
    int real;
    int imaginary;

};

void showComplex(struct complex n1[])
{   
    for(int i=0;i<5;i++)
    {

      printf("so the %d complex number is : %d + %di\n",i+1,n1[i].real,n1[i].imaginary);
    }
}
// void showComplex(comp *n1)
// {   comp *ptr=&n1;
//     for(int i=0;i<5;i++)
//     {

//       printf("so the %d complex number is : %d + %di\n",i+1,ptr[i]->real,ptr[i]->imaginary);
//     }
// }
int main()
{
  struct complex n1[5];
  for(int i=0;i<5;i++)
  {
  printf("enter the real value of the %d complex number\n",i+1);
  scanf("%d",&n1[i].real);
  printf("enter the imaginary value of the %d complex number\n",(i+1));
  scanf("%d",&n1[i].imaginary);
}

showComplex(n1);

 
return 0;
}