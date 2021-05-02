package example.com.FactoryPatternTutorial;

import org.omg.CORBA.StringHolder;

/**
 * Created by quang on 02.05.2021.
 */
public class Lion implements Animal {
    @Override
    public String getAnimalName()
    {
        return "Lion";
    }
}
