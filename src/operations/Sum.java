package src.operations;

import src.OldPound;
import src.convertor.Convertor;

public class Sum implements Operation {
    private final OldPound firstParameter;
    private final OldPound secondParameter;
    private OldPound result;

    public Sum(OldPound firstParameter, OldPound secondParameter) {
        this.firstParameter = firstParameter;
        this.secondParameter = secondParameter;
    }

    @Override
    public OldPound executeOperation() {
        Integer penniesFirstParameter = Convertor.odlPoundToPennies(firstParameter);
        Integer penniesSecondParameter = Convertor.odlPoundToPennies(secondParameter);
        result = Convertor.penniesToOldPound(penniesFirstParameter + penniesSecondParameter);
        return result;
    }

    @Override
    public String toString() {
        return "Sum " +
                "(" + firstParameter + ")" +
                " + " +
                "(" + secondParameter + ")" +
                " = " + result
                ;
    }
}

