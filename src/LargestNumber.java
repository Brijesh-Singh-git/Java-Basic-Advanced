public class LargestNumber {
    public static void main(String[] args) {

        int a = 10;
        int b = 50;
        int c =20;

        if(a>b && a>c){
            System.out.println("A is largest number");
        }
        if(b>c && b>a){
            System.out.println("B is largest number");
        }if(c>a && c>b){
            System.out.println("C is largest number");
        }
    }
}
