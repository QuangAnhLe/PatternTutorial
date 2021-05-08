package example.com.pattern.builder;

// @Builder(): co the su dung plugin hoac lombok
public class BigMacBurger {

    private String breadName;

    private String meat;

    private String sauce;

    private boolean withVeg;

    private boolean withCheese;

    private boolean withChilli;

    public BigMacBurger(String breadName, String meat, String sauce, boolean withVeg, boolean withCheese,
                        boolean withChilli) {
        this.breadName = breadName;
        this.meat = meat;
        this.sauce = sauce;
        this.withVeg = withVeg;
        this.withCheese = withCheese;
        this.withChilli = withChilli;
    }

    public String getBreadName() {
        return breadName;
    }

    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public boolean isWithVeg() {
        return withVeg;
    }

    public void setWithVeg(boolean withVeg) {
        this.withVeg = withVeg;
    }

    public boolean isWithCheese() {
        return withCheese;
    }

    public void setWithCheese(boolean withCheese) {
        this.withCheese = withCheese;
    }

    public boolean isWithChilli() {
        return withChilli;
    }

    public void setWithChilli(boolean withChilli) {
        this.withChilli = withChilli;
    }
}
