package LexCodesPractise.Ex2_arrays;

public class EmployeeRecord {
    public static void main(String[] args) {

        double salary[] = { 23500.00, 25080.00, 28760.0, 22340.0, 19890.0 };

        double sum=0;

       for(double x : salary){

          sum+=x;
       }
        double avgsalary = sum/salary.length;
        System.out.println("Average salary is: " + avgsalary );

       int countgreater =0;
       int countlower =0 ;
       for(double y : salary){

           if(y > avgsalary){
               countgreater++;
           } else {
               countlower++;
           }

       }
        System.out.println("No of employee having salires grater than the average is: " + countgreater);
        System.out.println("No of employee having salires lower than the average is: " + countlower);



    }
}
