package Encapsulation;

public class AccountMain {
    public static void main(String[] args) {

        Account a1 = new Account();

        a1.setAcc_no(11054);
        a1.setName("Pankaj Singh");
        a1.setAmount(89000);

        System.out.println(a1.getAcc_no());
        System.out.println(a1.getName());
        System.out.println(a1.getAmount());

    }
}
