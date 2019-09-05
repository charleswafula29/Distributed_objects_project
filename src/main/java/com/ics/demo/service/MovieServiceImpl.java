package com.ics.demo.service;

import com.ics.demo.NotFoundException;
import com.ics.demo.models.Movie;
import com.ics.demo.repositories.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public Movie findById(Long id) {
        return (Movie) movieRepository.findById(id).orElseThrow(()->
        new NotFoundException("No record with id "+id+" found"));
    }

    @Override
    public Movie create(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public void delete(Long id) {
        movieRepository.deleteById(id);
    }

    @Override
    public Movie update(Movie movie) {
        Movie foundmovie= findById(movie.getId());
        foundmovie.setName(movie.getName());
        foundmovie.setYearReleased(movie.getYearReleased());
        return movieRepository.save(foundmovie);
    }

    @Override
    public Movie update(Long id, Movie movie) {
        Movie foundmovie=findById(id);
        foundmovie.setName(movie.getName());
        foundmovie.setYearReleased(movie.getYearReleased());
        return movieRepository.save(foundmovie);
    }
}
