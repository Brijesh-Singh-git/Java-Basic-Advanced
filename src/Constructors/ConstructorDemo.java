package Constructors;

public class ConstructorDemo {

    int x;
    int y;
    String s;

 /*   ConstructorDemo() {  //Default Constructor

        x=60;
        y=90;
        s="Rohan Das";
    }

  */

    ConstructorDemo(int a, int b, String str){   //Parametrized Constructor
        x=a;
        y=b;
        s=str;
    }

    void displayData(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(s);
    }

    public static void main(String[] args) {

        //ConstructorDemo cd = new ConstructorDemo();  // we rae invoking the default constructor

        ConstructorDemo cd = new ConstructorDemo(50, 90, "Priya Rajput");
        cd.displayData();


    }
}
