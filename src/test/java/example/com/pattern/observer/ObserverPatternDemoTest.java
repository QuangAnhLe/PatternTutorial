package example.com.pattern.observer;

import org.junit.Assert;
import org.junit.Test;

public class ObserverPatternDemoTest {
    @Test
    public void test() {
        String email = "quanganh.le@gmail.com";
        String ip = "127.0.0.1";
        AccountService accountservice = new AccountService(email, ip);
        accountservice.attach(new Logger());
        accountservice.attach(new Mailer());
        accountservice.attach(new Protector());
        String account = accountservice.login();

        if("quanganh.le@gmail.com".equalsIgnoreCase(email)
                && "ip = 127.0.0.8".equalsIgnoreCase(ip))
        {
            accountservice.changeStatus(LoginStatus.EXPIRED);
        }
        Assert.assertEquals("quanganh.le@gmail.com",account);
    }
}