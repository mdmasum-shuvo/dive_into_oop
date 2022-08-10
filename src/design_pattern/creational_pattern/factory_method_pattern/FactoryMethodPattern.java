package design_pattern.creational_pattern.factory_method_pattern;


public class FactoryMethodPattern {

    public static void main(String[] args) {

        GetPlanFactory planFactory = new GetPlanFactory();
        Plan plan = planFactory.getPlanType(PlanType.DOMESTIC);
        plan.getRate();
        plan.calculateBill(10);

        plan = planFactory.getPlanType(PlanType.COMMERCIAL);
        plan.getRate();
        plan.calculateBill(10);
    }

}
