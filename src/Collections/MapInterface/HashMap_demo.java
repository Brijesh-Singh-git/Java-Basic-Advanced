package Collections.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMap_demo {
    public static void main(String[] args) {

        //declaration
        //HashMap h1 = new HashMap();
        //Map h2 = new HashMap();

        HashMap<Integer,String> hm = new HashMap<Integer,String>();

        hm.put(101,"John");
        hm.put(102,"Scott");
        hm.put(103,"John");
        hm.put(104,"Mary");
        hm.put(101,"David");


        System.out.println(hm); //{101=David, 102=Scott, 103=John, 104=Mary}

        //to find how many pairs
        System.out.println(hm.size());

        //to remove- we need to remove the whole pair
        hm.remove(104);
        System.out.println("After removal: " + hm); //{101=David, 102=Scott, 103=John}

        //to get specific value
        System.out.println(hm.get(103));

        //to print only keys
        System.out.println(hm.keySet());


        //print values from HashMap*****
        for(Object k : hm.keySet()){
            System.out.println(hm.get(k));
            //System.out.println(k + " : " +hm.get(k));

        }

        //clearing the data
        hm.clear();
        System.out.println(hm);







    }
}
