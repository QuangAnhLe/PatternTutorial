package example.com.FactoryPatternTutorial;

/**
 * Created by quang on 02.05.2021.
 */
public class PatternTutorial {
    public static void main (String[] agrs)
    {
        //System.out.println("Hello, World !");
     /*   AnimalFactory animalFactory = new AnimalFactory();
        Animal animal = animalFactory.getAnimal(AnimalTyp.Tiger);
        animal.getAnimalName();*/
     Animal animal = AnimalFactory.getAnimal(AnimalTyp.Lion);
     System.out.println(animal.getAnimalName());

    }
}
