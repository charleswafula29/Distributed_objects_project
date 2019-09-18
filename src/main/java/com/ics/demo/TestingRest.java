package com.ics.demo;

import com.ics.demo.models.Movie;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Type;
import java.util.List;

@Component
public class TestingRest implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
            RestTemplate restTemplate = new RestTemplate();

            ResponseEntity<List<Movie>> response = restTemplate.exchange(
                    "http://10.51.10.111:9090/movies",
                    HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<List<Movie>>() {}
            );
            List<Movie> movies = response.getBody();
            System.out.println(movies.toString());

            Movie movie = restTemplate.getForObject(
                    "http://10.51.10.111:9090/movies/4",
                    Movie.class
            );
            System.err.println(movie.toString());

            String url = "http://10.51.10.111:9090/movies/search?name=" +movie.getName();
            Movie movieByName = restTemplate.getForObject(
                    url,
                    Movie.class
            );
            System.err.println(movie.toString());
        }
    }
