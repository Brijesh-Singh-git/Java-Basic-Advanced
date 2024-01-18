package WrapperClass.DataConversionMethods;

public class DataConv {
    public static void main(String[] args) {

        //String to int
        String s  = "Hello";  // cannot convert into number

        String s1 = "20";
        String s2 = "50";

        System.out.println(s1+s2);

        System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));


        //String to double
        String a1 = "70.2";
        String a2 = "57.3";

        System.out.println(Double.parseDouble(a1) + Double.parseDouble(a2));


        System.out.println();
        System.out.println();


        //int,double,char,boolean ---> String

        int a =50;
        double d =13.2D;
        char c = 'a';
        boolean b = true;

        System.out.println(String.valueOf(a));
        System.out.println(String.valueOf(d));
        System.out.println(String.valueOf(c));
        System.out.println(String.valueOf(b));




    }
}
