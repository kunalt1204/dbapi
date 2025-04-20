package com.bms.dbapi.models;


import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "theatre")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter

public class Theatre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;

    String name;

    String address;

    int pincode;

    String state;

    @ManyToOne
    AppUser owner;










}
