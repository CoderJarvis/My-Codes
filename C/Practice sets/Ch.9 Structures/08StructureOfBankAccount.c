#include <stdio.h>
#include <string.h>
typedef struct bankAccount
{
    char acNo[11];
    char name[20];
    char mobileNo[10];
    char adharNo[16];
    char addres[20];
    float acBalnce; //in lakhs
}bank;

int main()
{   
        bank p1;
  strcpy(p1.acNo,"32679338268");
  strcpy(p1.name,"saswat kumar panda");
  strcpy(p1.mobileNo,"9853319315");
 strcpy(p1.adharNo,"735622828780");
 strcpy(p1.addres,"panikoili,jajpur,odisha,india");
p1.acBalnce=3.5;

printf("your account number is : %s \n",p1.acNo);
printf("your full name is : %s \n",p1.name);
printf("your mobile number is : %s \n",p1.mobileNo);
printf("your adhar  number is : %s \n",p1.adharNo);
printf("your address number is : %s \n",p1.addres);
printf("your account balance is : %.1f lakhs\n",p1.acBalnce);
return 0;
}