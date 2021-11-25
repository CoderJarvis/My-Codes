#include<iostream>
using namespace std;

class Base{
    private:
        int b;
    protected:
       int a; 
  
        int c=10;

};
/*
For a protected member:
                        Public derivation   Private Derivation   Protected Derivation
    1. Private members      Not Inherited   Not Inherited       Not Inherited
    2. Protected members    Protected       Private             Protected
    3. Public members       Public          Private             Protected
*/
class Derived: public Base{
public:
   void sum()
   {
       cout<<10*c;
   }
   
   
   
};

int main(){
    Base b;
    Derived d;
    // cout<<d.a;
     // Will not work since a is protected in both base as well as derived class
     d.sum();
    return 0;
}