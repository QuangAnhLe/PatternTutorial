package example.com.pattern.facade;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {

    @Test
    public void test(){
        String email = ShopFacade.getInstance().buyProductByCashWithFreeShipping("quanganh.le@gmail.com");
        String mobile = ShopFacade.getInstance().buyProductByPaypalWithStandardShipping("quanganh.le@gmail.com", "0123456789");

        Assert.assertEquals("quanganh.le@gmail.com",email);
        Assert.assertEquals("0123456789",mobile);
    }

}