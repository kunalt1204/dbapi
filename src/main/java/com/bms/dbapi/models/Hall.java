package com.bms.dbapi.models;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "halls")
public class Hall {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    String name;

    int capacity;

}
