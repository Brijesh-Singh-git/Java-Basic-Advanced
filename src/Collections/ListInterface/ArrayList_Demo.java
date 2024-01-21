package Collections.ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ArrayList_Demo {
    public static void main(String[] args) {


        //declaration
        ArrayList a1 = new ArrayList();
        //ArrayList <Integer> a1 = new ArrayList<Integer>();
        //List l1 = new ArrayList();


        //adding data elements into ArrayList
        a1.add(100);
        a1.add("Hello");
        a1.add(10.4);
        a1.add(null);
        a1.add(null);
        a1.add(true);

        //size of ArrayList
        System.out.println(a1.size());

        System.out.println(a1);  //[100, Hello, 10.4, null, null, true] - insertion order is preserved

        System.out.println(a1.remove(3));
        System.out.println(a1);


        //inserting new element in the middle of list
        a1.add(3,"Chandigarh");
        System.out.println(a1);

        System.out.println(a1.get(3));


        //Read data one by one
        for(Object x : a1){
            System.out.println(x);
        }

        //clear all the data from ArrayList
        a1.clear();
        System.out.println("After clearing the data: " + a1);




    }
}
