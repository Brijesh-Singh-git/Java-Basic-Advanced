package LexCodesPractise.Ex2TypeCasting;

public class BillDiscountMain {
    public static void main(String[] args) {

        BillDiscount b1 = new BillDiscount();

        b1.setBillId(1001);
        b1.setCustomerId(101);
        b1.setDiscount(2);
        b1.setBillAmount(199.99);

        System.out.println("Discount bill amount is: " + b1.getDisountedBillAmount());

    }
}
