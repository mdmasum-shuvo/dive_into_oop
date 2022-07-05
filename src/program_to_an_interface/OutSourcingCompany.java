package program_to_an_interface;

public class OutSourcingCompany extends Company {

    @Override
    public Employee[] getEmployees() {
        return new Employee[]{new Programmer()};
    }
}
