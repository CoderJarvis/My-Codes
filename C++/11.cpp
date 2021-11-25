#include<iostream>
using namespace std;

int main(){
    // for (int i = 0; i < 40; i++)
    // {
    //     /* code */
    //     cout<<i<<endl;
    //     if(i==22){
    //         break;
    //     }
    // }


    for (int i = 1; i <= 100; i++)
    {
        
        if(i==50){
            continue;
        }
        cout<<i<<endl;
    }

    
    return 0;
}
