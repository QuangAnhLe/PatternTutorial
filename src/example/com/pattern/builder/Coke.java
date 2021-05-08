package example.com.pattern.builder;

public class Coke extends ColdDrink{
    @Override
    public float price(){
        return 1.5f;
    }
    @Override
    public String name(){
        return "Coke";
    }
}
