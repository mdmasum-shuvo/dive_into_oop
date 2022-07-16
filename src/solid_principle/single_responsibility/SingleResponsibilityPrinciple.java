package solid_principle.single_responsibility;

public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {

        Customer customer1 = new Customer();
        customer1.setName("Masum");
        customer1.setAddress("Dhaka");

        Order order1 = new Order();
        order1.setCustomer(customer1);
        order1.setItemName("Mango");
        order1.setQuantity(10);
        order1.prepareOrder();

        BillCalculation billCalculation = new BillCalculation(order1);
        billCalculation.calculateBill();

        DeliveryApp deliveryApp = new DeliveryApp(order1);
        deliveryApp.delivery();


    }
}
