package com.bms.dbapi.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "bills")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    @ManyToOne
    AppUser user;
    @ManyToOne
    Show show;
    int totalTickets;
    String seats;
    int totalAmount;
    LocalDateTime startTime;
    LocalDateTime endTime;

}
