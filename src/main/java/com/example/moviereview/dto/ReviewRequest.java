package com.example.moviereview.dto;

import com.example.moviereview.domain.Movie;
import com.example.moviereview.domain.Reviews;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ReviewRequest {
    private String comment;
    private Double rating;
    private Long movieId;

    public Reviews toReviews() {
        return Reviews.builder()
                .comments(comment)
                .rating(rating)
                .movie(Movie.builder()
                        .id(movieId)
                        .build())
                .build();
    }
}
