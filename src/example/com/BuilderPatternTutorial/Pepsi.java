package example.com.BuilderPatternTutorial;

public class Pepsi extends ColdDrink{
    @Override
    public float price(){
        return 1.8f;
    }
    @Override
    public String name(){
        return "Pepsi";
    }
}
