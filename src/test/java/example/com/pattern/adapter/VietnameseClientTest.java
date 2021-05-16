package example.com.pattern.adapter;

import org.junit.Assert;
import org.junit.Test;

public class VietnameseClientTest {

    @Test
    public void test(){
        VietnameseTarget client = new TranslatorAdapter(new JapaneseAdaptee());
        String japaneseWord= client.send("xin chao");
        Assert.assertEquals(japaneseWord,"こんにちは");
    }
}