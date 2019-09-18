package com.ics.demo;

import com.ics.demo.models.Movie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "client", url = "http://10.51.10.111:9090")
public interface FeignRestClient {

    @RequestMapping(method = RequestMethod.GET,value = "movies")
    List<Movie> getAllMovies();

    @RequestMapping(method = RequestMethod.GET,value = "movies/{id}")
    Movie findById(@PathVariable(name = "id") Long id);

    @RequestMapping(method = RequestMethod.POST, value = "movies")
    Movie createMovie(@RequestBody Movie movie);

    @RequestMapping(method = RequestMethod.PATCH, value = "movies/{id}")
    Movie update(@PathVariable("id") Long id,@RequestBody Movie movie);
}
