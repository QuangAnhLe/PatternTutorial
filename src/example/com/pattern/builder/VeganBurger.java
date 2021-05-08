package example.com.pattern.builder;

public class VeganBurger extends Burger{
    @Override
    public float price(){
        return 2.0f;
    }
    @Override
    public String name(){
        return "Vegan-Burger";
    }
}