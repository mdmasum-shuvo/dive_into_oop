package design_pattern.creational_pattern.factory_method_pattern;

public abstract class Plan {

     double rate;

    public abstract void getRate();

    public void calculateBill(int units) {
        System.out.println(units * rate);
    }

}
