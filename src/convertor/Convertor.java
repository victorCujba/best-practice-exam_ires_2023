package src.convertor;

import src.OldPound;

public class Convertor {
    public static Integer odlPoundToPennies(OldPound oldPound) {
        return 240 * oldPound.getPounds() + 12 * oldPound.getShillings() + oldPound.getPennies();
    }

    public static OldPound penniesToOldPound(Integer pennies) {
        return new OldPound(pennies / 240, (pennies / 12) % 20, pennies % 12);

    }

}

