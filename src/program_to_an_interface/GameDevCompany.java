package program_to_an_interface;

public class GameDevCompany extends Company {
    @Override
    public Employee[] getEmployees() {
        return new Employee[]{new Designer(), new Artist()};
    }
}
