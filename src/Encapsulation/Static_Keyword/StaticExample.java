package Encapsulation.Static_Keyword;

public class StaticExample {

    static int a =20;  // static variable
    int b = 10;  // non-static

    static void m1(){  //static
        System.out.println("This is a static method m1()");
    }

    void m2(){  //non-static
        System.out.println("This is a non-static method m2()");
    }


    void m(){ //non-static method
        System.out.println(a);   //Accessing all the things directly
        System.out.println(b);

        m1();
        m2();
    }





}
