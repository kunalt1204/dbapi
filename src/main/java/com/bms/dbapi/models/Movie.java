package com.bms.dbapi.models;


import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;

    String name;
    Double duration;

    boolean isRelease;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_owner_id")
    private AppUser movieOwner;

    int review;

    int totalReviewVotes;

    String language;

}
