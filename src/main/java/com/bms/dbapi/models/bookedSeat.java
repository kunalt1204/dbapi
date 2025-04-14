package com.bms.dbapi.models;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "bookedseats")
public class bookedSeat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;

    UUID showId;
    int seatNumber;

}
