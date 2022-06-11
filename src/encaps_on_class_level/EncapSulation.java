package encaps_on_class_level;

import oop_pillars.PrintInterface;

import java.util.ArrayList;
import java.util.List;

public class EncapSulation  {
    public static void main(String[] args) {

        List<Item> items=new ArrayList<>();
        Item item1=new Item("Iphone","Electronics",10,10);
        Item item2=new Item("Ship","Vehicles",10,10);
        Item item3=new Item("Iphone","Electronics",100000,100);
        items.add(item1);
        items.add(item2);
        items.add(item3);
        Order order=new Order();
        order.setCountry("US");
        order.setItems(items);
        order.getOrderTotal();


    }


}
