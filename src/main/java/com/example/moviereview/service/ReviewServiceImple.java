package com.example.moviereview.service;

import com.example.moviereview.domain.Movie;
import com.example.moviereview.domain.Reviews;
import com.example.moviereview.repository.MovieRepository;
import com.example.moviereview.repository.ReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ReviewServiceImple implements ReviewService{
    @Autowired
    private ReviewsRepository reviewsRepo;
    @Autowired
    private MovieRepository movieRepo;
    @Override
    public Reviews save(Reviews reviews) {
        Movie movie = movieRepo.findById(reviews.getMovie().getId()).orElseThrow();
        if(movie != null) {
            Double avg = reviewsRepo.getReviewAvg(movie.getId());
            movie.setRating(avg);
            movieRepo.save(movie);
        }
        return reviewsRepo.save(reviews);
    }
}
