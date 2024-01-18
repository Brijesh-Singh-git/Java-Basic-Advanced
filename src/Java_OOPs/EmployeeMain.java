package Java_OOPs;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.eid =101;
        e1.ename ="Rohan Das";
        e1.designation ="Developer";
        e1.sal = 45000;
        e1.display();

        Employee e2 = new Employee();
        e2.eid =102;
        e2.ename ="Pooja Gupta";
        e2.designation ="Tester";
        e2.sal = 78000;
        e2.display();

    }
}
