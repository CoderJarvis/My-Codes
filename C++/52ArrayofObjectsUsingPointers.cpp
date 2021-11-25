#include<iostream>
using namespace std;

class ShopItem
{
    int id;
    float price;
    public:
        void setData(int a, float b){
            id = a;
            price = b;
        }
        void getData(void){
            cout<<"IteamID = "<<id<<"----->"<<" Price = "<<price<<endl;
           
        }
};
        // 1 2 3
        //        ^
        //        |
        //        |
        //        ptr
        // ptrTemp
int main(){
    int size = 10;
    // int *ptr = &size;
    // int *ptr = new int [34];

    // 1. general store item
    // 2. veggies item
    // 3. hardware item
    ShopItem *ptr = new ShopItem [size];
    cout<<sizeof(*ptr)<<endl;
    ShopItem *ptrTemp = ptr;    //for temporarily store the address stored by ptr
    int p, i;
    float q;
    for (i = 0; i < size; i++)
    {
        cout<<"Enter Id and price of item "<< i+1<<endl;
        cin>>p>>q;
        // (*ptr).setData(p, q);
        ptr->setData(p, q);
        ptr++; 
    }
        cout<<"Details of the all iteams\n";

    for (i = 0; i < size; i++)
    {
     //   cout<<"Item number: "<<i+1<<endl;
        ptrTemp->getData();
        ptrTemp++;
    }
    
    
    return 0;
}