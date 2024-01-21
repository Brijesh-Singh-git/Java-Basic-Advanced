package Collections.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class HashSet_demo {
    public static void main(String[] args) {

        //declaration
        HashSet h1 = new HashSet();
        //Set s1 = new HashSet();
        //HashSet <String> h2 = new HashSet<String>();


        //adding the data
        h1.add(40);
        h1.add("Hello");
        h1.add(70.865);
        h1.add(true);
        h1.add(null);
        h1.add(null);
        h1.add(40);
        h1.add(40);

        System.out.println(h1); // it will not show the duplciated values only single values will be there | Insertion order is not preserved
        System.out.println(h1.size()); //5

        //remove element - as indexing is not supported therefore we specify the value
        h1.remove(40);
        System.out.println("After removing: " + h1);

        //insertion is not possible in hashset - not possible

        //get specific value of hashset -- Not possible

        for(Object x : h1){
            System.out.println(x);



        }




    }
}
