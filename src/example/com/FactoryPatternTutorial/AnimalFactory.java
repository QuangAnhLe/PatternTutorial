package example.com.FactoryPatternTutorial;

/**
 * Created by quang on 02.05.2021.
 */
enum AnimalTyp {
    Lion, Tiger
        }
public class AnimalFactory {

    private AnimalFactory(){

    }
    public static final Animal getAnimal(AnimalTyp animalTyp){
        switch (animalTyp){
            case Tiger:
                return new Tiger();
            case Lion:
                return new Lion();
            default:
                throw new IllegalArgumentException("It isn't animal...");
        }
    }
}
