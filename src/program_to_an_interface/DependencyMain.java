package program_to_an_interface;

public class DependencyMain {

    public static void main(String[] args) {
        Employee employee[] = {new Designer(), new Programmer(), new Tester()};

        for (Employee e : employee
        ) {
            e.doWork();
        }
    }
}
