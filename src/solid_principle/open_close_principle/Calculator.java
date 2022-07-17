package solid_principle.open_close_principle;

import java.security.InvalidParameterException;

public class Calculator {

    public void Calculate(CalculatorOperation operation){
        if (operation==null){
            throw new InvalidParameterException("Can not perform");
        }

        operation.perform();
    }
}
