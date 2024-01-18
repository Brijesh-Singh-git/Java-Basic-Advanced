import java.util.Arrays;

public class SingleDimensionalArray {
    public static void main(String[] args) {

        //1. Declare and array

        //Approach 1

       /* int a[] = new int[5];  //Declaration
        a[0]=500;
        a[1]=80;
        a[2]=57;
        a[3]=12;
        a[4]=696;

        System.out.println(a[3]);

        */

        //Approach 2
        int a[] = {500,600,20,75,56};

        //Read the single value from an Array
        System.out.println(a[3]);

        //Size or Length of Array
        System.out.println("Length of an Array is --> " + a.length);

        //Retrieve all the values from Array
        System.out.println(Arrays.toString(a));

        //Get all the data using the loop
        for(int i=0; i<a.length; i++){

            //System.out.println(a[i]);
        }

        //Using the for-each/enhanced for-loop
        for(int x :a ){
            System.out.println(x);
        }






    }
}
