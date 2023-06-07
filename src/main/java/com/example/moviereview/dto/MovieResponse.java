package com.example.moviereview.dto;

import com.example.moviereview.domain.Genre;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class MovieResponse {
    private String name;
    private Double rating;
    private Genre genre;
}
