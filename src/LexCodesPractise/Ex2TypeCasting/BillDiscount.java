package LexCodesPractise.Ex2TypeCasting;

public class BillDiscount {

    int billId;
    int customerId;
    int discount;
    double billAmount;
    double disountedBillAmount;

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public double getDisountedBillAmount() {
        disountedBillAmount = billAmount-billAmount*(discount/100);
        return disountedBillAmount;
    }


}
