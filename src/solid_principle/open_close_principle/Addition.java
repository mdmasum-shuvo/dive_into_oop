package solid_principle.open_close_principle;

public class Addition implements CalculatorOperation {
    private double firstNumber;
    private double secondNumber;
    private double result;

    public Addition(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public void perform() {
        result = firstNumber + secondNumber;
        System.out.println(result);

    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
