package com.ics.demo;

import com.ics.demo.models.Appointment;
import com.ics.demo.models.Movie;
import com.ics.demo.models.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Component
public class TestingRest implements CommandLineRunner {

    private final FeignRestClient feignRestClient;

    public TestingRest(FeignRestClient feignRestClient) {
        this.feignRestClient = feignRestClient;
    }


    @Override
    public void run(String... args) throws Exception {
            RestTemplate restTemplate = new RestTemplate();
//
//            ResponseEntity<List<Movie>> response = restTemplate.exchange(
//                    "http://10.51.10.111:9090/movies",
//                    HttpMethod.GET,
//                    null,
//                    new ParameterizedTypeReference<List<Movie>>() {}
//            );
//            List<Movie> movies = response.getBody();
//            //System.out.println(movies.toString());
//
//
//            Movie movie = restTemplate.getForObject(
//                    "http://10.51.10.111:9090/movies/4",
//                    Movie.class
//            );
            //System.err.println(movie.toString());

//            String url = "http://10.51.10.111:9090/movies/search?name=" +movie.getName();
//            Movie movieByName = restTemplate.getForObject(
//                    url,
//                    Movie.class
//            );
            //System.err.println(movie.toString());


//        Movie newmovie=new Movie("Lacazette!!!!!!!!","2019");
//        newmovie=feignRestClient.createMovie(newmovie);
//        System.out.println("Created Movie"+newmovie.toString());

//        movies=feignRestClient.getAllMovies();
//        System.err.println(movies.toString());
//
//          Movie updatemovie=new Movie("Just updated now","2019");
//          updatemovie=feignRestClient.update((long)11,updatemovie);
//          System.out.println("updated"+updatemovie.toString());

        Student student =new Student(95049,"charles");
        feignRestClient.createStudent(student);

//        Appointment newappAppointment=new Appointment(5,1);
//        newappAppointment=feignRestClient.ConfirmAppointment((long)9,(long)5);
        //feignRestClient.createAppointment(newappAppointment);
        //feignRestClient.createStudent(student);

//        System.err.println("Created Appointment"+newappAppointment.toString());

        }
    }
