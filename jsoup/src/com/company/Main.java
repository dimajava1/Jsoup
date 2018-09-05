package com.company;
import java.util.Date;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Main {

    public static void main(String[] args) {


        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Date date = new Date();
                    Document document = Jsoup.connect("https://www.youtube.com/").get();
              String text = document.text();
                    System.out.println(text +"  Time:  " + date.getTime()/60);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }).start();
    }
}
