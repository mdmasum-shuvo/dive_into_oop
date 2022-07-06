package solid_principle.single_responsibility;

import java.util.Random;

public class Order {
    private Customer customer;
    private String orderId;
    private String itemName;
    private int quantity;
    private int totalBillAmount;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        Random random = new Random();

        this.orderId = orderId + "-" + random.nextInt(500);
        this.orderId = orderId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
        setOrderId(itemName);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalBillAmount() {
        return totalBillAmount;
    }

    public void setTotalBillAmount(int totalBillAmount) {
        this.totalBillAmount = totalBillAmount;
    }

    public void prepareOrder(){
        System.out.println("Preparing order for customer -"
                + this.getCustomer().getName()
                + " who has ordered "
                + this.getItemName());
    }
}
