package com.example.moviereview.controller;

import com.example.moviereview.domain.Genre;
import com.example.moviereview.domain.Movie;
import com.example.moviereview.dto.MovieRequest;
import com.example.moviereview.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/movie")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/getmovies")
    public ResponseEntity<?> getMovies() {
        return new ResponseEntity<>(movieService.getAllMovies(), HttpStatus.OK);
    }
    @PostMapping("/addmovie")
    public ResponseEntity<?> addMovie(@RequestBody MovieRequest movie) {
        return new ResponseEntity<>(movieService.addMovie(movie.movieReq()), HttpStatus.OK);
    }

    @GetMapping("/getmovie/{name}")
    public ResponseEntity<?> getMovieByName(@PathVariable(value = "name") String name) {
        return new ResponseEntity<>(movieService.getMovieByName(name), HttpStatus.OK);
    }

    @GetMapping("/getmovieid/{id}")
    public ResponseEntity<?> getMovieById(@PathVariable(value = "id") Long id) {
        return new ResponseEntity<>(movieService.getMovieById(id), HttpStatus.OK);
    }

    @GetMapping("/getmoviesgenre/{genre}")
    public ResponseEntity<?> getMoviesByGenre(@PathVariable(value = "genre")String genre) {
        return new ResponseEntity<>(movieService.getMovieByGenre(genre.toUpperCase()), HttpStatus.OK);
    }
}
