package Encapsulation.Static_Keyword;

public class StaticMain {
    public static void main(String[] args) {

        //1) Static methods can access the static stufff difrectly(without any object creation)

        System.out.println(StaticExample.a);
        StaticExample.m1();

        //System.out.println(b); //error-- as we cannot access the non-static stuff directly
        //m2();

        //2) Static methods can access the non-static stuff through the Object creation
        StaticExample s1 = new StaticExample();

        System.out.println(s1.b);
        s1.m2();


        s1.m();

    }
}
