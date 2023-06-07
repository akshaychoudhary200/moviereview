package com.example.moviereview.repository;

import com.example.moviereview.domain.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ReviewsRepository extends JpaRepository<Reviews, Long> {
    @Query(value = "select avg(rating) from reviews where movie_id=?",nativeQuery = true)
    Double getReviewAvg(Long id);

}
