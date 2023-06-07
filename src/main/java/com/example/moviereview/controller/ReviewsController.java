package com.example.moviereview.controller;

import com.example.moviereview.domain.Reviews;
import com.example.moviereview.dto.ReviewRequest;
import com.example.moviereview.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/reviews")
public class ReviewsController {
    @Autowired
    private ReviewService reviewService;

    @PostMapping("/addreview")
    public ResponseEntity<?> addReview(@RequestBody ReviewRequest review) {
        return new ResponseEntity<>(reviewService.save(review.toReviews()), HttpStatus.OK);
    }


}
