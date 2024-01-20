package Exception_handling;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {

        /*

        //Example 1 -- Arithmetic Exception
        System.out.println("Program is started");
        System.out.println("Program is in Progress....");


        //Take input from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        System.out.println(100/num);


        System.out.println("Program is completed");
        System.out.println("Program is exited.....");


         */

        /*

        //Example 2 --- ArrayIndexOutOfBoundsException

        int a[] = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        System.out.println("Enter the position between (0 to 4) : ");
        int pos = sc.nextInt();

        a[pos] = num;

        System.out.println(a[pos]);

        System.out.println("Program is completed");
        System.out.println("Program is exited.....");


         */

        //Example 3 - NumberFormatException

        String s = "Welcome";
        int num = Integer.parseInt(s);
        System.out.println(s);


    }
}
