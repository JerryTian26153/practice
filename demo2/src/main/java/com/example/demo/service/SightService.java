package com.example.demo.service;

import com.example.demo.repository.SightRepository;
import com.example.demo.entity.Sight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SightService {
    //KeelungSightsCrawler crawler = new KeelungSightsCrawler();
    @Autowired
    private SightRepository repository;
    /*@PostConstruct//@EventListener()
    private void initDB() {
        Sight[] sights = crawler.getItems();
        repository.deleteAll();
        for(Sight s:sights){
            repository.save(s);
        }
    }*/
    public List<Sight> getSight(String id) {
        return repository.findByZone(id);
    }
    public Sight createSight(Sight request) {
        Sight sight = new Sight(request);
        return repository.insert(sight);
    }
}
