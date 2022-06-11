package encaps_on_class_level;

import oop_pillars.PrintInterface;

import java.util.List;

public class Order implements PrintInterface {
    private List<Item> items;
    private String country;
    private TaxCalculator taxCalculator;
    private static int orderId = 0;

    public Order() {
        orderId++;
    }

    public void getOrderTotal() {
        taxCalculator = new TaxCalculator();
        double total = 0.0;
        for (int i = 0; i < items.size(); i++) {
            double subtotal = (items.get(i).getPrice() * items.get(i).getQuantity())*taxCalculator.getTaxRate(country,items.get(i));
            total += subtotal;
            print(items.get(i).getName() + " :" + subtotal);
        }
        print("Total Price: " + total);

    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    @Override
    public void print(String s) {
        System.out.println(s);
    }
}
