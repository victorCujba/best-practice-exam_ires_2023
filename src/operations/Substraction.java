package src.operations;

import src.OldPound;
import src.convertor.Convertor;

public class Substraction implements Operation {

    private final OldPound firstParameter;
    private final OldPound secondParameter;
    private OldPound result;

    private OldPound negativeResult;

    public Substraction(OldPound firstParameter, OldPound secondParameter) {
        this.firstParameter = firstParameter;
        this.secondParameter = secondParameter;
    }

    @Override
    public OldPound executeOperation() {
        Integer penniesFirstParameter = Convertor.odlPoundToPennies(firstParameter);
        Integer penniesSecondParameter = Convertor.odlPoundToPennies(secondParameter);
        if (Convertor.odlPoundToPennies(firstParameter) > Convertor.odlPoundToPennies(secondParameter)) {
            result = Convertor.penniesToOldPound(penniesFirstParameter - penniesSecondParameter);
            return result;
        } else {
            return negativeResult = Convertor.penniesToOldPound(penniesFirstParameter - penniesSecondParameter);
        }

    }

    @Override
    public String toString() {
        return "Substraction " +
                "(" + firstParameter + ")" + " -  " + "(" + secondParameter + ")" +
                " = " + ((result != null) ? result : "0d")
                + "(" + ((negativeResult != null) ? negativeResult : "") + ")";
    }
}
