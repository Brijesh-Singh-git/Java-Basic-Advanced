package Polymorphism;

public class ConstructorOverloading {


    int x,y,z;
    double d;

    ConstructorOverloading(){  //1
        x=60;
        y=90;
        System.out.println(x+y);
    }
    ConstructorOverloading(int a , int b){  ///2
        x=a;
        y=b;
        System.out.println(x+y);
    }

    ConstructorOverloading(int a, double b){ //3
        x=a;
        d=b;
        System.out.println(x+d);
    }

    ConstructorOverloading(double b, int a){ //4
        x=a;
        d=b;
        System.out.println(x+d);
    }


    void  display(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(d);
    }


    public static void main(String[] args) {

        //ConstructorOverloading cd = new ConstructorOverloading(); //1

//        ConstructorOverloading cd = new ConstructorOverloading(100, 50); //2

        ConstructorOverloading cd = new ConstructorOverloading(100.5, 50); //4

//        ConstructorOverloading cd = new ConstructorOverloading(100, 50.5); //3

//        ConstructorOverloading cd = new ConstructorOverloading(100.5, 50.5); //Error as no constructor is created with these params


        cd.display();
    }
}
