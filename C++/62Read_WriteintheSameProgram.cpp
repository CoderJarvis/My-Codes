#include<iostream>
#include<fstream>
#include <string.h>
 
using namespace std;
 
int main(){
 
              // connecting our file with hout stream
               ofstream ob("sampleNew.txt");
   
               // creating a name string variable and filling it with string entered by the user
              char name[50];
               cout<<"Enter your name: ";
              gets(name);
              //cout<<name;
              
     
             // writing a string to the file
             ob<<name;
 
            // disconnecting our file
            ob.close();
          // creating a content string variable and filling it with string present there in the text file
           string st2;
            // connecting our file with hin stream
           ifstream ob2("sampleNew.txt");
           getline(ob2,st2);
           cout<<st2;
          

            
          
 
           // disconnecting our file
           ob2.close();
           return 0;
}
