public class TwoDimensionalArray {
    public static void main(String[] args) {

        //Declaration

        //Approach 1
        //int a[][] = new int[3][2];

     /*
        a[0][0] = 100;
        a[0][1] = 500;

        a[1][0] = 70;
        a[1][1] = 250;

        a[2][0] = 590;
        a[2][1] = 150;

      */

        //Approach 2
        int a[][] = {{300,400},{500,600},{100,56},{40,70}};

        //Length of Array
        System.out.println(a.length);
        System.out.println(a[0].length);

        //Read specific value from Array
        System.out.println(a[2][1]);
        System.out.println(a[1][1]);


        //Reading data from array using classic for loop

//        for(int r=0; r<a.length; r++){
//
//            for(int c=0; c<a[r].length; c++){
//
//                System.out.println(a[r][c] + " ");
//            }
//            System.out.println();
//        }

        //Reading the data from 2D Array using the For-Each Loop

        for(int x[] : a){

            for(int v : x){
                System.out.println(v + " ");
            }
            System.out.println();
        }
    }
}
