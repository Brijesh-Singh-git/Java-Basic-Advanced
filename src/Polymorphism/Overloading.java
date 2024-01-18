package Polymorphism;

public class Overloading {

    int x,y,z;
    double d;

    void sum(){  //1
        x=20;
        y=50;
        System.out.println(x+y);

    }
    void sum(int a, int b){  //2
        x=a;
        y=b;
        System.out.println(x+y);

    }
    void sum(int a,  double b){  //3
        x=a;
        d=b;
        System.out.println(x+d);

    }
    void sum( double b,int a){  //4
        x=a;
        d=b;
        System.out.println(x+d);

    }

    public static void main(String[] args) {

        Overloading od = new Overloading();
        od.sum();  //1

        od.sum(50,50);  //2

        od.sum(10,80.5);  //3

        od.sum(40.8,20); //4


    }
}
