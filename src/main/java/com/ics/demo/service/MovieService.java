package com.ics.demo.service;

import com.ics.demo.models.Actor;
import com.ics.demo.models.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> findAll();

    Movie findById(Long id);

    Movie create(Movie movie);

    void delete(Long id);

    Movie update(Movie movie);

    Movie update(Long id, Movie movie);

    Actor createActor(Long id, Actor actor);
}
