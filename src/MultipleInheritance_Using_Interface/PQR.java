package MultipleInheritance_Using_Interface;

public class  PQR extends MNO implements ABC, XYZ {


    @Override
    public void m1() {
        System.out.println("This is m1() from ABC Interface");
        System.out.println(x);

    }

    @Override
    public void m2() {
        System.out.println("This is m2() from XYZ Interface");
        System.out.println(y);
    }

    public static void main(String[] args) {

        PQR p1 = new PQR();

        p1.m1();
        p1.m2();
        p1.m3();

    }
}
