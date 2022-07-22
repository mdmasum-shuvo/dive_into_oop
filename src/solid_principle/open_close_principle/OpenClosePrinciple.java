package solid_principle.open_close_principle;

public class OpenClosePrinciple {

    public static void main(String[] args) {
        CalculatorOperation addition = new Addition(10.2, 30);
        CalculatorOperation subtraction = new Subtraction(30,10);
        CalculatorOperation division = new Division(30,2);

        Calculator calculator = new Calculator();
        calculator.Calculate(addition);
        calculator.Calculate(subtraction);
        calculator.Calculate(division);
    }
}
