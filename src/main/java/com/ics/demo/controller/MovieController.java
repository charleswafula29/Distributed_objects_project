package com.ics.demo.controller;

import com.ics.demo.models.Movie;
import com.ics.demo.repositories.MovieRepository;
import com.ics.demo.service.MovieService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<Movie> findAll(){
        return movieService.findAll();
    }

    @GetMapping(value = "{id}")
    public Movie findById(@PathVariable Long id){
        return movieService.findById(id);
    }

    @PostMapping
    public Movie create(@Validated({Movie.Create.class}) @RequestBody Movie movie){
        return movieService.create(movie);
    }

    @DeleteMapping(value = "{id}")
    public void delete(@PathVariable Long id){
        movieService.delete(id);
    }

    @PatchMapping
    public Movie update(@Validated(Movie.Update.class)@RequestBody Movie movie){
        return movieService.update(movie);
    }

    @PatchMapping(value = "{id}")
    public Movie update(@PathVariable Long id,@RequestBody Movie movie){
        return movieService.update(id,movie);
    }
}
