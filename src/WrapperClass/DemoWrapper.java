package WrapperClass;

public class DemoWrapper {
    public static void main(String[] args) {


        //Primitive Variables
        byte b = 10;
        short s  =50;
        int i =20;
        long l = 90;
        float f = 59.6F;
        double d = 34.2D;
        char c  = 'a';
        boolean b2 = true;


        //Primitive to Object conversion : Autoboxing
        Byte byteObj = b;
        Short shortObj = s;

        System.out.println(byteObj);
        System.out.println(shortObj);



        //converting Objects to Primitive : Unboxing
        byte bytevalue = byteObj;
        short shortvalue = shortObj;

        System.out.println(bytevalue);
        System.out.println(shortvalue);




    }
}
