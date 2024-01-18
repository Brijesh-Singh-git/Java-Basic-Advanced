package Java_OOPs;

public class Student {

    int id;
    String sname;
    char grade;


    void show(){
        System.out.println(id + "   " + sname +  "   " + grade);
    }

    void setData(int Id, String name, char g) {
        id = Id;
        sname = name;
        grade = g;
    }

   Student(int Id, String name, char g) {
        id = Id;
        sname = name;
        grade = g;
    }

}
