#include <iostream>
using namespace std;

// Base Class
class Employee
{
    int a,b;
public:
    int id;
    float salary;
    int c;
    Employee(int inpId)
    {
        id = inpId;
        salary = 34.0;
    }
    Employee() {
        cout<<"this is base class constructor\n";
    }
    void setData()
    {
        cout<<"hy\n";
    }
};

// Derived Class syntax
/*
class {{derived-class-name}} : {{visibility-mode}} {{base-class-name}}
{
    class members/methods/etc...
}
Note:
1. Default visibility mode is private
2. Public Visibility Mode: Public members of the base class becomes Public members of the derived class
3. Private Visibility Mode: Public members of the base class becomes Private members of the derived class
4. Private members are never inherited
*/

// Creating a Programmer class derived from Employee Base class
class Programmer :  Employee
{
public:
    int languageCode;
    Programmer(int inpId)
    { //  a=3;
    
        id = inpId;
        languageCode = 9;
    }
    void getData(){
        cout<<id<<endl;
    }
    void sett()
    {
        c=99;
        cout<<c<<endl;  
    }
};

int main()
{
    Employee harry(1), rohan(2);
    cout << harry.salary << endl;
    cout << rohan.salary << endl;
    Programmer skillF(10);//before derive cls construtor it will execute base class default constructor
    cout << skillF.languageCode<<endl;
  //  cout << skillF.id<<endl;
    skillF.getData();
    skillF.sett();
  //  skillF.setData;
   // skillF.c=8;
    return 0;
}