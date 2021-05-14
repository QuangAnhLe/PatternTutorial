package example.com.pattern.adapter;

public class VietnameseClient {
    public static void main (String[] args){
        VietnameseTarget client = new TranslatorAdapter(new JapaneseAdaptee());
        client.send("xin chao");

    }
}
