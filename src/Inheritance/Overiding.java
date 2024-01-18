package Inheritance;


class Bank {

    double roi(){
        return 0.0;
    }
}

class AXIS extends Bank{
    double roi(){
        return 8.56;
    }
}

class SBI extends Bank{

    double roi(){
        return 11.56;
    }
}

public class Overiding {

    public static void main(String[] args) {

        AXIS a1 = new AXIS();
        System.out.println(a1.roi()); //8.56

        SBI s1 = new SBI();
        System.out.println(s1.roi()); //11.56

        Bank b1 = new Bank();
        System.out.println(b1.roi());  //0.0
    }
}
