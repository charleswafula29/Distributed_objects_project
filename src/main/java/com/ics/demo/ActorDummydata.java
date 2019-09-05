package com.ics.demo;

import com.ics.demo.models.Actor;
import com.ics.demo.repositories.ActorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ActorDummydata implements CommandLineRunner {
    private final ActorRepository actorRepository;

    public ActorDummydata(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Actor actor1= new Actor("Charles Wafula");
        Actor actor2= new Actor("Ruth Maina");
        Actor actor3= new Actor("Zendaya");


        actorRepository.save(actor1);
        actorRepository.save(actor2);
        actorRepository.save(actor3);
    }
}
