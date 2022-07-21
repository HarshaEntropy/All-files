package com.Harry6081.moviecatalogueservice.resources;


import com.Harry6081.moviecatalogueservice.models.CatalogItem;
import com.Harry6081.moviecatalogueservice.models.Movie;
import com.Harry6081.moviecatalogueservice.models.Rating;
import com.Harry6081.moviecatalogueservice.models.UserRating;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogueResource {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WebClient.Builder webClientBuilder;

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){


        UserRating ratings= restTemplate.getForObject("http://localhost:8083/ratingdata/user/"+userId,UserRating.class);

        return ratings.getUserRating().stream().map(rating ->{
            Movie movie = restTemplate.getForObject("http://localhost:8082/movies/foo"+rating.getMovieId(), Movie.class);

            //            Movie movie = webClientBuilder.build()
//                    .get()
//                    .uri("http://localhost:8082/movies/foo"+rating.getMovieId())
//                    .retrieve()
//                    .bodyToMono(Movie.class)
//                    .block();
            return new CatalogItem(movie.getName(),"Desc",rating.getRating() );
        })
                .collect(Collectors.toList());

//        return Collections.singletonList(new CatalogItem("Transformers","Test",4));


    }
}
