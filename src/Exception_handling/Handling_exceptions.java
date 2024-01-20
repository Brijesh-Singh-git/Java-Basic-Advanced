package Exception_handling;

import java.util.Scanner;

public class Handling_exceptions {
    public static void main(String[] args) {


        //Example 1 -- Arithmetic Exception
        System.out.println("Program is started");
        System.out.println("Program is in Progress....");


        //Take input from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        //int num = sc.nextInt();

        String s = null;


/*
        try{
            //System.out.println(100/num);
            System.out.println(s.length());

        } catch (ArithmeticException e) {

            System.out.println("You have entered the wrong1 ");
        }
        catch (NumberFormatException e){
            System.out.println("You have entered the wrong2 ");
        }
        catch (NullPointerException e){
            System.out.println("You have entered the wrong3 ");
        }

 */
        //Handle all exceptions using single catch block
        try{
            //System.out.println(100/num);
            System.out.println(s.length());
        }catch (Exception e){
            System.out.println("Invalid input");
        }

        System.out.println("Program is completed");
        System.out.println("Program is exited.....");
    }
}
