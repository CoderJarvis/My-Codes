#include<iostream>
using namespace std;

typedef struct employee
{
    /* data */
    int eId; //4
    char favChar; //1
    float salary; //4
} ep;

union money
{
   
    int rice; //4
    char car; //1
    float pounds; //4
};
enum direction{North,south,east,west};

int main(){

    direction d1=North;
    cout<<d1+1;

//    enum Meal{ breakfast, lunch, dinner};
 //   Meal m1 = lunch;
  //  cout<<(m1==2);
    // cout<<breakfast;
    // cout<<lunch;
    // cout<<dinner; 
    // union money m1;
    //  m1.rice = 34;
    //  m1.car = 'a';
    //  m1.pounds=56.8f;
    //  cout<<m1.car;
    // cout<<m1.car;
   // cout<<sizeof(m1);

    // ep harry;
    // struct employee shubham;
    // struct employee rohanDas;
    // harry.eId = 1;
    // harry.favChar = 'c';
    // harry.salary = 120000000;
    // cout<<"The value is "<<harry.eId<<endl; 
    // cout<<"The value is "<<harry.favChar<<endl; 
    // cout<<"The value is "<<harry.salary<<endl; 

   







    return 0;
}
