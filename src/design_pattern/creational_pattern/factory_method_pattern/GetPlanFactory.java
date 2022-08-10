package design_pattern.creational_pattern.factory_method_pattern;

public class GetPlanFactory {

    public Plan getPlanType(PlanType type) {
        if (type == null) {
            return null;
        }

        if (type == PlanType.DOMESTIC) {
            return new DomesticPlan();
        } else if (type == PlanType.COMMERCIAL) {
            return new CommercialPlan();
        } else if (type == PlanType.INSTITUTIONAL) {
            return new InstitutionalPlan();
        }
        return null;
    }

}
