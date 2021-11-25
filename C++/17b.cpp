#include<iostream>
using namespace std;

inline int product(int a, int b){
    // Not recommended to use below lines with inline functions
    // static int c=0; // This executes only once
    // c = c + 1; // Next time this function is run, the value of c will be retained
    return a*b;
}

float moneyReceived(int currentMoney, float factor=0.04){ //default agrument
    return currentMoney * factor;
}

double circleArea(int r,const double pi=3.141){//constant argument
   // pi=8;
    return pi*r*r;
}
int main(){
    int a, b;
    // cout<<"Enter the value of a and b"<<endl;
    // cin>>a>>b;
    // cout<<"The product of a and b is "<<product(a,b)<<endl;
    int money = 100000;
    // cout<<"u r a normal people so If you have "<<money<<" Rs in your bank account, you will give "<<moneyReceived(money)<< "Rs after 1 year"<<endl;
    // cout<<"you r a VIP so If you have "<<money<<" Rs in your bank account, you will give        "<<moneyReceived(money, 0.20f)<< " Rs after 1 year";

    cout<<"the area of the circle is : "<<circleArea(4);


    return 0;
}
