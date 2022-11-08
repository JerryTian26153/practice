package com.example.demo.crawler;

import com.example.demo.entity.Sight;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Vector;

public class KeelungSightsCrawler {
    public Document document;

    public Sight[] getItems() {
        int i;
        Vector<Sight> vecSights = new Vector<Sight>();
        try
        {
            document = Jsoup.connect("https://www.travelking.com.tw/tourguide/taiwan/keelungcity/").get();
            Elements sightLinks = document.select("div.box_ss");
            Elements links = sightLinks.select("a[href]");
            for(Element link:links){
                //System.out.println("\nlink : " + link.attr("href"));
                //System.out.println("text : " + link.text());
                Document linkDocument = Jsoup.connect(link.attr("abs:href")).get();
                Elements sightLinks2 = linkDocument.select("div.box");
                Elements links2 = sightLinks2.select("a[href]");
                for(Element link2:links2) {
                    //System.out.println("\nlink : " + link2.attr("href"));
                    //System.out.println("text : " + link2.text());
                    Document link2Document = Jsoup.connect(link2.attr("abs:href")).get();
                    //System.out.println(link2.text()+link.text()+link2Document.select("span.point_type").select("strong").text()+link2Document.select("span.point_type").select("strong").text()+link2Document.select("div.gpic").select("img.lazyload").attr("data-src")+link2Document.select("div.address").select("span").text()+link2Document.select("div.text").first().text());
                    vecSights.add(new Sight((String) link2.text(),(String) link.text(),(String) link2Document.select("span.point_type").select("strong").text(),(String) link2Document.select("div.gpic").select("img.lazyload").attr("data-src"),(String) link2Document.select("div.address").select("span").text(),(String) link2Document.select("div.text").first().text(),(String) link2Document.select("div.address").select("a").attr("href")));
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        Sight[] sights = new Sight[vecSights.size()];
        for(i=0;i< vecSights.size();i++) {
            //System.out.println(vecSights.get(i));
            sights[i] = new Sight(vecSights.get(i));
        }
        return sights;
    }
    public Sight[] getItems2(String selectZone) {
        int i;
        Vector<Sight> vecSights = new Vector<Sight>();
        try
        {
            document = Jsoup.connect("https://www.travelking.com.tw/tourguide/taiwan/keelungcity/").get();
            Elements sightLinks = document.select("div.box_ss");
            Elements links = sightLinks.select("a[href]");
            for(Element link:links){
                //System.out.println("\nlink : " + link.attr("href"));
                //System.out.println("text : " + link.text());
                if(link.text().equals(selectZone)){
                    Document linkDocument = Jsoup.connect(link.attr("abs:href")).get();
                    Elements sightLinks2 = linkDocument.select("div.box");
                    Elements links2 = sightLinks2.select("a[href]");
                    for(Element link2:links2) {
                        //System.out.println("\nlink : " + link2.attr("href"));
                        //System.out.println("text : " + link2.text());
                        Document link2Document = Jsoup.connect(link2.attr("abs:href")).get();
                        //System.out.println(link2.text()+link.text()+link2Document.select("span.point_type").select("strong").text()+link2Document.select("span.point_type").select("strong").text()+link2Document.select("div.gpic").select("img.lazyload").attr("data-src")+link2Document.select("div.address").select("span").text()+link2Document.select("div.text").first().text());

                        vecSights.add(new Sight((String) link2.text(),(String) link.text(),(String) link2Document.select("span.point_type").select("strong").text(),(String) link2Document.select("div.gpic").select("img.lazyload").attr("data-src"),(String) link2Document.select("div.address").select("span").text(),(String) link2Document.select("div.text").first().text(),(String) link2Document.select("div.address").select("a").attr("href")));
                    } /*vecSights.add(new Sight((String) link2.text(),(String) link.text(),(String) link2Document.select("span.point_type").select("strong").text(),(String) link2Document.select("div.gpic").select("img.lazyload").attr("data-src"),(String) link2Document.select("div.address").select("span").text(),(String) link2Document.select("div.text").first().text(),(String) link2Document.select("div.address").select("a").attr("href")));
                    }*/
                    break;
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        Sight [] sights = new Sight[vecSights.size()];
        for(i=0;i< vecSights.size();i++) {
            //System.out.println(vecSights.get(i));
            sights[i] = new Sight(vecSights.get(i));
        }
        return sights;
    }
}
