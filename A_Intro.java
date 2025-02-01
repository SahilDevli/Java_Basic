/* Java is object-oriented programming language so everything is done in 
    Java is in form of classes and objects

    -> a class contain variable(called data member), fuctions/methods(calles member function)
    -> Syntax:
        class class_name{
            int var;
            void method(){
                // code here
            }
        }
*/

/*
Scanner class mainly is used to get input from user.
so we have to create a object to access th method of classes.
*/

import java.util.Scanner; // syntax for import pre-defined classes in Java

public class A_Intro {  // main class: class contain main method 'p.s.v.m'
    public static void main(String[] args) {    // main method
        System.out.println("Hello World!"); // print statement
        int num = 10; // variable declaration and initialization

        Scanner obj_name = new Scanner(System.in); // create object of Scanner class  
        int var = obj_name.nextInt(); // to take int value from user
        String str = obj_name.nextLine(); // to take string from user

        System.out.println("You entered: " + var);  // print statement with user input
        System.out.println("You entered: " + str);  // print statement with user input
    
        obj_name.close();// close object



        //---------------------     operators       ---------------------

        // arithmetic operations
        System.out.println("Sum: " + (num + 5));  // print statement with result of operation
        
        // assignment operator (=)
        num = num + 5;
        System.out.println("Sum: " + num);  // print statement with result of operation
        
        // increment and decrement operators (++, --)
        num++;
        System.out.println("Sum: " + num);  // print statement with result of operation
        
        num--;
        System.out.println("Sum: " + num);  // print statement with result of operation
        
        // relational operators (>, <, ==, >=, <=, etc) ��explore more on web
        
        // equality operator (==)
        System.out.println(num == 5);  // print statement with result of operation
        
        // logical operators (&&, ||,!, etc) ��explore more on web
        
        // logical AND operator (&&)
    }
}
