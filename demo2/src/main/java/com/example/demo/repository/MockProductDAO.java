package com.example.demo.repository;
/*
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.*;
import java.util.stream.Collectors;

@Repository
public class MockProductDAO {
    private final List<Sight> productDB = new ArrayList<>();
    KeelungSightsCrawler crawler = new KeelungSightsCrawler();
    MockProductDAO(){
        initDB();
    }
    @PostConstruct
    private void initDB() {
        Sight[] sights = crawler.getItems();
        for(Sight s:sights){
            productDB.add(s);
        }
    }
    public Sight insert(Sight sight) {
        productDB.add(sight);
        return sight;
    }
    public Sight[] insert(Sight[] sights) {
        for(Sight s:sights){
            productDB.add(s);
        }
        return sights;
    }
    public List<Sight> find(String id) {
        return productDB.stream()
                .filter(p -> p.getZone().toUpperCase().contains(id.toUpperCase()))
                .collect(Collectors.toList());
    }

}*/
//   Test function
    /*public Optional<Sight[]> find(String id) {
        Vector<Sight> vecSights = new Vector<Sight>();
        vecSights = (Vector<Sight>) productDB.stream()
                .filter(p -> p.getZone().toUpperCase().contains(id.toUpperCase()))
                .collect(Collectors.toList());
        Sight[] sights = new Sight[vecSights.size()];
        for(int i=0;i< vecSights.size();i++) {
            //System.out.println(vecSights.get(i));
            sights[i] = new Sight(vecSights.get(i));
        }
        return Optional.of(sights);
    }*/
    /*public Sight replace(String id, Sight product) {
        Optional<Sight> productOp = find(id);
        productOp.ifPresent(p -> {
            p.setName(product.getName());
            p.setPrice(product.getPrice());
        });

        return product;
    }*/