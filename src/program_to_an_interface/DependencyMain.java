package program_to_an_interface;

public class DependencyMain {

    public static void main(String[] args) {

        Company gameDevCompany = new GameDevCompany();
        Company outSourcingCompany = new OutSourcingCompany();
        Employee gameDev[] = gameDevCompany.getEmployees();
        Employee outSource[] = outSourcingCompany.getEmployees();

        System.out.println("Game Developer Company");
        for (Employee e : gameDev) {
            e.doWork();

        }
        System.out.println("Out Sourcing Company");

        for (Employee e : outSource) {
            e.doWork();

        }
    }
}
