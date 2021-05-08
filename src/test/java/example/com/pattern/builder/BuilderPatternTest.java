package example.com.pattern.builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class BuilderPatternTest {
    @Test
    public void testCreateBuilder(){
       BurgerRestaurant burger = new  BurgerRestaurantBuilder().withPacking("wrapper").withBurger("veganBurger").
               withColdDrink("coke").withPrice(3.0f).build();
        {
            /*System.out.println(burger.getBurger() + " " + burger.getPacking()
                    + " " + burger.getColdDrink() + " Price: " + burger.getPrice());*/
        }
       assertEquals("veganBurger", burger.getBurger());

    }

}