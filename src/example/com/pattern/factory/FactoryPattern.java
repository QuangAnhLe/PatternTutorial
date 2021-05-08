package example.com.pattern.factory;

public class FactoryPattern {
    public static void main (String[] agrs)
    {
        Animal animal = AnimalFactory.getAnimal(AnimalTyp.Tiger);
        System.out.println(animal.getAnimalName());
    }
}
