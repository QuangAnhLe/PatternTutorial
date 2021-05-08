package example.com.pattern.builder;

public class BigMacBurgerBuilder {

    private String breadName;

    private String meat;

    private String sauce;

    private boolean withVeg;

    private boolean withCheese;

    private boolean withChilli;

    public BigMacBurgerBuilder withBreadName(String breadName) {
        this.breadName = breadName;
        return this;
    }

    public BigMacBurgerBuilder withMeat(String meat) {
        this.meat = meat;
        return this;
    }

    public BigMacBurgerBuilder withSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public BigMacBurgerBuilder withVeg(boolean withVeg) {
        this.withVeg = withVeg;
        return this;
    }

    public BigMacBurgerBuilder withCheese(boolean withCheese) {
        this.withCheese = withCheese;
        return this;
    }

    public BigMacBurgerBuilder withChilli(boolean withChilli) {
        this.withChilli = withChilli;
        return this;
    }

    public BigMacBurger build() {
        return new BigMacBurger(breadName, meat, sauce, withVeg, withCheese, withChilli);
    }
}
