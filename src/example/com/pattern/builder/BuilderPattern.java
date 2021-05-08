package example.com.pattern.builder;

public class BuilderPattern {
    public static void main (String[] args){
        //System.out.println("Hello World");
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegaMeal = mealBuilder.prepareVegMeal();
        System.out.println("Vegan Meal");
        vegaMeal.showItems();
        System.out.println("Total Cost: " + vegaMeal.getCost());
    }
}
