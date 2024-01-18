package Interfaces_Demo;

interface Shape{

    int length = 50;  //final and static by default
    int width = 20; //final and static by default

    void circle();  //abstract method


    default void sqaure(){  //default method
        System.out.println("This is a Square - default");
    }

    static void rectangle(){
        System.out.println("This is a rectangle - static ");
    }
}






public class Inheritance_Demo implements Shape {


    public void circle(){
        System.out.println("This is a circle");
    }



    public static void main(String[] args) {

        Inheritance_Demo i1 = new Inheritance_Demo();

        i1.circle();
        i1.sqaure();

        Shape.rectangle(); //static methods can be accessed directly.


        //Shape s1 = new Shape(); //incorrect
        Shape s1 = new Inheritance_Demo();

        s1.circle();
        s1.sqaure();
    }
}
