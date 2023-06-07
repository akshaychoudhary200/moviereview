package com.example.moviereview.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movie")
@ToString
@Builder
public class Movie {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;

    private Double rating;

    @Enumerated(EnumType.STRING)
    private Genre genre;

   @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private List<Reviews> reviewsList;

}
