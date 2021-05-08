package example.com.pattern.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BigMacBurgerTest {

    @Test
    public void testCreateBurger() {
        BigMacBurger bigmac = new BigMacBurgerBuilder().withBreadName("banh mi den").withMeat("thit bo")
                .withSauce("ketchup").withCheese(true).withChilli(false).withVeg(true).build();

        assertEquals("banh mi den", bigmac.getBreadName());
    }

}
