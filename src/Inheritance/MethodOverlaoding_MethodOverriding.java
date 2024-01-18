package Inheritance;

class ABC {

    void m1(int a){
        System.out.println(a);
    }

    void m2(int b){
        System.out.println(b);
    }
}

class XYZ extends ABC {

    void m1(int a){  //Overrided method
        System.out.println(a*a);
    }

    void m2(int a, int b){  //Overloaded method
        System.out.println(a+b);
    }
}


public class MethodOverlaoding_MethodOverriding {
    public static void main(String[] args) {

        XYZ xyz = new XYZ();

        xyz.m1(50);
        xyz.m2(10);
        xyz.m2(20,10);
    }
}
