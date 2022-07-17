package solid_principle.open_close_principle;

public class Subtraction implements CalculatorOperation {
    private double firstNumber;
    private double secondNumber;
    private double result;

    public Subtraction(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public void perform() {
        result = firstNumber - secondNumber;
        System.out.println(result);

    }
}
