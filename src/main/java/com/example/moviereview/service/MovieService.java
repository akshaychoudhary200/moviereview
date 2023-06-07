package com.example.moviereview.service;

import com.example.moviereview.domain.Genre;
import com.example.moviereview.domain.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MovieService {
    Movie addMovie(Movie movie);
    List<Movie> getAllMovies();

    List<Movie> getMovieByName(String name);
    Optional<Movie> getMovieById(Long id);

    List<Movie> getMovieByGenre(String genre);
}
