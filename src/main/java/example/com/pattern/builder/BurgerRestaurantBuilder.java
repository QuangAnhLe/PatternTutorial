package example.com.pattern.builder;

public class BurgerRestaurantBuilder {

    private String packing;

    private String burger;

    private String coldDrink;

    private float price;

    public BurgerRestaurantBuilder withPacking(String packing) {
        this.packing = packing;
        return this;
    }

    public BurgerRestaurantBuilder withPrice(float price) {
        this.price = price;
        return this;
    }

    public BurgerRestaurantBuilder withBurger(String burger) {
        this.burger = burger;
        return this;
    }

    public BurgerRestaurantBuilder withColdDrink(String coldDrink) {
        this.coldDrink = coldDrink;
        return this;
    }


    public BurgerRestaurant build() {
        return new BurgerRestaurant(packing, burger, coldDrink, price);
    }

}

