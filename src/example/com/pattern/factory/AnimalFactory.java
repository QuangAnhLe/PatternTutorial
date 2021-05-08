package example.com.pattern.factory;

import example.com.pattern.factory.datatypes.Animal;
import example.com.pattern.factory.datatypes.AnimalTyp;
import example.com.pattern.factory.datatypes.Lion;
import example.com.pattern.factory.datatypes.Tiger;

/**
 * Created by quang on 02.05.2021.
 */
public class AnimalFactory {

    private AnimalFactory() {

    }

    public static final Animal getAnimal(AnimalTyp animalTyp) {
        switch (animalTyp) {
            case Tiger:
                return new Tiger();
            case Lion:
                return new Lion();
            default:
                throw new IllegalArgumentException("It isn't animal...");
        }
    }
}
