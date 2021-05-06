package example.com.BuilderPatternTutorial;

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
