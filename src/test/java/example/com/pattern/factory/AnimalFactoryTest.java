package example.com.pattern.factory;

import example.com.pattern.factory.datatypes.Animal;
import example.com.pattern.factory.datatypes.AnimalTyp;
import org.junit.Assert;
import org.junit.Test;

// Test Driven Programming. Test Driven Design
public class AnimalFactoryTest {

    @Test
    public void test() {
        Animal lion = AnimalFactory.getAnimal(AnimalTyp.Lion);
        String animalName = lion.getAnimalName();
        Assert.assertEquals("Lion",animalName);
    }

}
