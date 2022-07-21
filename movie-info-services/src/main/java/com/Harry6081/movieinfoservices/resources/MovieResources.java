package com.Harry6081.movieinfoservices.resources;

import com.Harry6081.movieinfoservices.models.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieResources {

    @RequestMapping("/{movieId}")
    public Movie grtMovieInfo(@PathVariable("movieId")String movieId){
        return new Movie(movieId,"Test name");

    }
}
