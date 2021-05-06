package example.com.BuilderPatternTutorial;

public class ChickenBurger extends Burger{
    @Override
    public float price(){
        return 3.0f;
    }
    @Override
    public String name(){
        return "Chicken-Burger";
    }
}
