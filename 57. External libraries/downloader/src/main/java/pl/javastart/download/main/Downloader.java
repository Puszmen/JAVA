package pl.javastart.download.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Downloader {
    public static void main(String[] args) throws IOException {

        Document document = Jsoup.connect("https://wykop.pl/").get();

        Elements h5elements = document.select("h5");
        for (Element h5element : h5elements) {
            String h5ElementAttr = h5element.select("a").first().attr("href");
            String h5Text = h5element.text();
            System.out.println(h5Text + " ::: " + h5ElementAttr);
        }

    }
}
