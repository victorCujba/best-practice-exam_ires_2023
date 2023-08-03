package src;

public class OldPound {

    private final Integer pounds;
    private final Integer shillings;

    private final Integer pennies;


    public OldPound(Integer pounds, Integer shillings, Integer pennies) {
        this.pounds = pounds;
        this.shillings = shillings;
        this.pennies = pennies;
    }

    public Integer getPounds() {
        return pounds;
    }

    public Integer getShillings() {
        return shillings;
    }

    public Integer getPennies() {
        return pennies;
    }


    @Override
    public String toString() {
        return pounds + "P " +
                shillings + "s  " +
                pennies + "d";
    }

}
