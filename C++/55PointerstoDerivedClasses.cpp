#include<iostream>
using namespace std;
class BaseClass{
    public:
        int var_base=1;
        void display(){
            cout<<"Dispalying Base class variable var_base "<<var_base<<endl;
            cout<<endl;
        }
};

class DerivedClass : public BaseClass{
    public:
            int var_derived=1111111;
            void display(){
               
                cout<<"Dispalying Derived class variable var_derived "<<var_derived<<endl;
                cout<<endl;
            }
};

int main(){
    // BaseClass * base_class_pointer;
    // BaseClass obj_base;
    // DerivedClass obj_derived;
    // base_class_pointer = &obj_derived; // Pointing base class pointer to derived class

    // base_class_pointer->var_base = 34;
    // // base_class_pointer->var_derived= 134; // Will throw an error
    // base_class_pointer->display();

    // base_class_pointer->var_base = 3400; 
    // base_class_pointer->display();

    // DerivedClass * derived_class_pointer;
    // derived_class_pointer = &obj_derived;
    // derived_class_pointer->var_base = 9448;
    // derived_class_pointer->var_derived = 98;
    // derived_class_pointer->display();

    BaseClass Bobj;
    DerivedClass Dobj;

    BaseClass *Bptr;
    DerivedClass *Dptr;

    Bptr=&Bobj;
    Bptr->display();
    

    Dptr=&Dobj;
    Dptr->var_base=999;
    Dptr->display();

    Bptr=&Dobj;//base class pinter can point to derive class object left side is the strongest
    Bptr->var_base=555;
    Bptr->display();

   // Dptr=&Bobj; //derived class pointer can't point to base class object



    return 0;
}