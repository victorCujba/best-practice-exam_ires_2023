package src.operations;

import src.OldPound;
import src.convertor.Convertor;

public class Division implements Operation {
    private final OldPound firstParameter;
    private final Integer secondParameter;
    private OldPound result;

    public Division(OldPound firstParameter, Integer secondParameter) {
        this.firstParameter = firstParameter;
        this.secondParameter = secondParameter;
    }

    @Override
    public OldPound executeOperation() {
        Integer penniesFirstParameter = Convertor.odlPoundToPennies(firstParameter);
        result = Convertor.penniesToOldPound(penniesFirstParameter / secondParameter);
        return result;
    }

    @Override
    public String toString() {
        return "Division " +
                "(" + firstParameter + ")" +
                " / " +
                "(" + secondParameter + ")" +
                " = " + result
                ;
    }
}
