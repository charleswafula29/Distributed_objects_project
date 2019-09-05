package com.ics.demo;

import com.ics.demo.models.Actor;
import com.ics.demo.models.Movie;
import com.ics.demo.repositories.ActorRepository;
import com.ics.demo.repositories.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DummyData implements CommandLineRunner {
    private final MovieRepository movieRepository;

    public DummyData(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Movie movie=new Movie("Aubameyang - fastest man alive","2019");
        Movie movie1=new Movie("Lacazette - the best","2019");
        Movie movie2=new Movie("Pepe - the shark","2019");

        movieRepository.save(movie);
        movieRepository.save(movie1);
        movieRepository.save(movie2);
    }
}
