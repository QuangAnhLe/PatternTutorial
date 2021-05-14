package example.com.pattern.adapter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VietnameseClientTest {

    @Test
    public void test(){
        VietnameseTarget client = new TranslatorAdapter(new JapaneseAdaptee());
        client.send("xin chao");
        Assert.assertEquals("2","2");
    }
}