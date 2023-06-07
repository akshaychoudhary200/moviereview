package com.example.moviereview.dto;

import com.example.moviereview.domain.Genre;
import com.example.moviereview.domain.Movie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieRequest {
    private String name;
    private Genre genre;
    public Movie movieReq() {
        return Movie.builder().name(name).genre(genre).rating(0.0).build();
    }
}
