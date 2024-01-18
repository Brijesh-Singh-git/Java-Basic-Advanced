public class StringOperations {
    public static void main(String[] args) {

        String s = "Welcome";

        System.out.println(s);

        //length of string
        System.out.println(s.length());

        //concat - joining of two strings

        String s1 = "Welcome";
        String s2 = "to";
        String s3 = "India";

        System.out.println(s1+s2+s3);

        System.out.println(s1.concat(s2).concat(s3));


        //Trim - remove the right and left spaces

        s = "          Automation          ";

        System.out.println("Before Trimming ---> " + s.length());
        System.out.println(s.trim());
        System.out.println("After Trimming ----> " + s.trim().length());


        //charAt() - returns a single char based on index we passed

        s = "Welcome";
        System.out.println(s.charAt(3));
        System.out.println(s.charAt(5));
        System.out.println(s.charAt(1));

        //contains() - returns the boolean value

        System.out.println(s.contains("lcom"));
        System.out.println(s.contains("mre"));



        //equals() ,  equalsIgnoreCase() --- compare the 2 Strings
        //both the methods returns a boolean value

        s1 = "Welcome";
        s2 = "welcome";

        System.out.println(s1.equals(s2));   //false
        System.out.println(s1.equalsIgnoreCase(s2)); //true


        //replace() - replace single/multiple characters in a String

        s ="welcome to java programming and selenium testing";

        System.out.println(s.replace('a', 'X'));
        System.out.println(s.replace("selenium", "Appium"));


        //substring() - to extract substring from main String
        s = "Welcome";
        System.out.println(s.substring(2,5));
        System.out.println(s.substring(1,6));


        //split() - divide the string into multiple parts using delimeter
        //we cannot use * $ ^ . + -  (these as delimeter as they are regular expressions in Java)
        s="abc@amazon.com";

//        String a[] = s.split("@"); //here @ is delimeter
        String a[] = s.split("z"); //here z is delimeter


        System.out.println(a[0]);
        System.out.println(a[1]);


        //toUpperCase() , toLowerCase()
        s = "WelCome";
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());






    }
}
