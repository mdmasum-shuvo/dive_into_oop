package design_pattern.creational_pattern.factory_method_pattern;

public class DomesticPlan extends Plan {

    @Override
    public void getRate() {
        rate = 3.5;
    }
}
