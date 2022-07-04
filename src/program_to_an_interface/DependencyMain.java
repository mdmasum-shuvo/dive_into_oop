package program_to_an_interface;

public class DependencyMain {

    public static void main(String[] args) {
        Designer d = new Designer();
        d.designArchitecture();
        Programmer p = new Programmer();
        p.writeCode();
        Tester t = new Tester();
        t.testSoftware();
    }
}
