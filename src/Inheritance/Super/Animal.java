package Inheritance.Super;

public class Animal {

    String color = "White";

    void eat(){
        System.out.println("Eating.......");
    }

}

class Dog extends  Animal{

    String color = "Black";

    void displayColor(){
        System.out.println(color);  //black
        System.out.println(super.color);//white
    }


    void eat(){

        System.out.println("Eating bread................");
        super.eat();
    }
}
