package example.com.pattern.builder;

public class BurgerRestaurant {

    private String packing;

    private final String burger;

    private final String coldDrink;

    private final float price;

    public BurgerRestaurant(String packing, String burger, String coldDrink, float price) {
        this.packing = packing;
        this.burger = burger;
        this.coldDrink = coldDrink;
        this.price = price;
    }

    public String getPacking() {
        return packing;
    }
    public void setPacking(String packing){
        this.packing = packing;
    }

    public String getBurger() {
        return burger;
    }

    public String getColdDrink() {
        return coldDrink;
    }

    public float getPrice() {
        return price;
    }
}
