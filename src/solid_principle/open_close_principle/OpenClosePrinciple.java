package solid_principle.open_close_principle;

public class OpenClosePrinciple {

    public static void main(String[] args) {
        Addition addition = new Addition(10.2, 30);

        Calculator calculator = new Calculator();
        calculator.Calculate(addition);
    }
}
