package com.example.moviereview.service;

import com.example.moviereview.domain.Genre;
import com.example.moviereview.domain.Movie;
import com.example.moviereview.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImple implements MovieService{
    @Autowired
    private MovieRepository movieRepo;
    @Override
    public Movie addMovie(Movie movie) {
        return movieRepo.save(movie);
    }
    @Override
    public List<Movie> getAllMovies() {
        return movieRepo.findAll();
    }

    @Override
    public List<Movie> getMovieByName(String name) {

        return movieRepo.findAllByName(name);
    }

    @Override
    public Optional<Movie> getMovieById(Long id) {
        return movieRepo.findById(id);
    }

    @Override
    public List<Movie> getMovieByGenre(String genre) {
        if (Arrays.stream(Genre.values()).noneMatch(gen -> gen.toString().equals(genre))) return new ArrayList<>();
        List<Movie> moviesList = movieRepo.findByGenre(Genre.valueOf(genre));
        if (!moviesList.isEmpty()) {
            return moviesList;
        }
        return null;
    }
}
