#include<iostream>
using namespace std;

class BaseClass{
    public:
        int  var_base=1;
        int var=9;

       virtual  void display(){
            cout<<"1 Dispalying Base class variable var_base "<<var_base<<endl;
           
        }
};

class DerivedClass : public BaseClass{
    public:
            int var_derived=2;
            int var=9000;

            void display(){
                cout<<"2 Dispalying Base class variable var_base "<<var_base<<endl;
                cout<<"2 Dispalying Derived class variable var_derived "<<var_derived<<endl;
                
            }
};
int main(){
    BaseClass * base_class_pointer;
    
    DerivedClass obj_derived;

    base_class_pointer = &obj_derived;
    base_class_pointer->display();
    cout<<base_class_pointer->var;
    return 0;
}