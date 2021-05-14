package example.com.pattern.adapter;

public class TranslatorAdapter implements VietnameseTarget {
    private JapaneseAdaptee japaneseadapte;

    public TranslatorAdapter(JapaneseAdaptee japaneseadapte) {
        this.japaneseadapte = japaneseadapte;
    }

    @Override
    public void send(String words) {
        System.out.println("Reading Words...");
        System.out.println(words);
        String vietnameseWords = this.transtlate(words);
        System.out.println("Sending Words ...");
        japaneseadapte.receive(vietnameseWords);
    }

    private String transtlate(String vietnameseWorlds) {
        System.out.println("Translated");
        return "こんにちは";
    }
}
