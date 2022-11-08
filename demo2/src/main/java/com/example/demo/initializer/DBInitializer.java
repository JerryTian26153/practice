package com.example.demo.initializer;


import com.example.demo.crawler.KeelungSightsCrawler;
import com.example.demo.entity.Sight;
import com.example.demo.repository.SightRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DBInitializer implements ApplicationRunner {
    private final SightRepository userRepository;
    private KeelungSightsCrawler crawler= new KeelungSightsCrawler();
    private DBInitializer(SightRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Sight[] sights = crawler.getItems();
        userRepository.deleteAll();
        for(Sight s:sights){
            userRepository.save(s);
        }
    }
}
