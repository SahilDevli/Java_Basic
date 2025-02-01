/*
    OOPS - Object Oriented Programming System

    can say programming done in form of Classes and Objects
        class - blueprint.
        object - real world entity created from class.

    ---------------     4 pillars of oops       ------------------

    - Encapsulation : wrapping of data.

    - Inheritance : use property of one class into another class.

    - Polymorphism :-
                Polymorphism allows subclasses to define their own unique behaviors while sharing some of the same functionality as the parent class. 
                Polymorphism is achieved through method overriding and method overloading. 
                Polymorphism allows developers to define one interface and have multiple implementations. 

    - Abstraction : hiding of data.

 */
interface InnerE_oops {
    // interface don't have data members

    // abstract method
    public void Sum(int a,int b);
}

class demo_oops implements InnerE_oops{ // Single unit contain mutiple data : Encapsulation
    // data members for this class
    private int pin = 1234;         // object can't access private data members : Abstraction
    protected String str = "abc";
    public double dub = 123.456; 

    // member functions for this class
    public void display_info(){
        System.out.println("Pin: " + pin); // can only be access through methods.
        System.out.println("String: " + str);
        System.out.println("Double: " + dub);
    }

    // overriding abstract method : Polymorphism
    public void Sum(int a, int b){
        System.out.println("Sum of two integers: " + (a-b)); // we can change the funtionality of function acc. to use.
    }

}
public class E_oops extends demo_oops{ // extends demo_oops class into main class : Inheritance
    public static void main(String[] args) {
        demo_oops ob = new demo_oops();
        ob.display_info();
        ob.Sum(2,1);    // multi level Inheritance if InnerE_oops is class (Sum method came from: InnerE_oops -> demo_oops -> E_oops )
    }
}
