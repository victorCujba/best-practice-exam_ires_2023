package src.operations;

import src.OldPound;
import src.convertor.Convertor;

public class Multiplication implements Operation {
    private final OldPound firstParameter;
    private final Integer secondParameter;
    private OldPound result;

    public Multiplication(OldPound firstParameter, Integer secondParameter) {
        this.firstParameter = firstParameter;
        this.secondParameter = secondParameter;
    }

    @Override
    public OldPound executeOperation() {
        Integer penniesFirstParameter = Convertor.odlPoundToPennies(firstParameter);
        result = Convertor.penniesToOldPound(penniesFirstParameter * secondParameter);
        return result;
    }

    @Override
    public String toString() {
        return "Multiplication " +
                "(" + firstParameter + ")" +
                " * " +
                "(" + secondParameter + ")" +
                " = " + result
                ;
    }
}
