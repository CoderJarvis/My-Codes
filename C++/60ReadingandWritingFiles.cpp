#include<iostream>
#include<fstream>

using namespace std;

int main(){
    string st="i will crack tcs this year";
    // Opening files using constructor and writing it
    ofstream ob("sample1.txt"); // Write operation
    ob<<st;




    // Opening files using constructor and writing it
    string st1;
    ifstream ob1("sample2.txt");
    //  ob1>>st1; //this only stores one word of the line
    getline(ob1,st1);
    cout<<st1;


    return 0;
}
