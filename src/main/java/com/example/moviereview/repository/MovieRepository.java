package com.example.moviereview.repository;

import com.example.moviereview.domain.Genre;
import com.example.moviereview.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findAll();

    Optional<Movie> findById(Long id);

    List<Movie> findAllByName(String name);

    List<Movie> findByGenre(Genre genre);
}
