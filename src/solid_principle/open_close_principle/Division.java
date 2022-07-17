package solid_principle.open_close_principle;

public class Division implements CalculatorOperation {
    private double firstNumber;
    private double secondNumber;
    private double result;

    public Division(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public void perform() {
        if (secondNumber !=0){
            result = firstNumber /secondNumber;
        }
        System.out.println(result);
    }
}