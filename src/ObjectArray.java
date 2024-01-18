public class ObjectArray {
    public static void main(String[] args) {

        Object a[] = new Object[5];
        a[0]= 964.5465;
        a[1]= "Brijesh";
        a[2]= "Welcome";
        a[3]= 3.56;
        a[4]= 265456465;

        for(Object x : a){
            System.out.println(x);
        }
    }
}
