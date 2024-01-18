package Java_OOPs;

public class StudentMain {
    public static void main(String[] args) {

        //Approach 1 --> Using Reference Variable
      // Student stu = new Student();
       /*  stu.id = 101;
        stu.sname = "Rohan Singh";
        stu.grade = 'B';


        */

        //Approach 2 ---> Using the Method

        //stu.setData(101, "Rohan Singh", 'B');


        //Approach 3 ---> Using the constructor
        Student stu = new Student(101, "Rohan Singh", 'B');
        stu.show();


    }
}
