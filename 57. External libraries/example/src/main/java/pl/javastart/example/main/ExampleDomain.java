package pl.javastart.example.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;

public class ExampleDomain {
    public static void main(String[] args) throws IOException {

        Document document = Jsoup.connect("http://example.com/").get();

        String text1 = document.select("h1").first().text();
        String text2 = document.select("p").first().text();

        stringReader("Nagłówek h1");
        stringReader(text1);
        stringReader("Nagłówek 1");
        stringReader(text2);
    }
    private static void stringReader(String text) {
        System.out.println(text);
    }
}
