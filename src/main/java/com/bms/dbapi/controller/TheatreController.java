package com.bms.dbapi.controller;


import com.bms.dbapi.models.Theatre;
import com.bms.dbapi.repository.theatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ap1/v1/db/theatre")
public class TheatreController {

    @Autowired
    theatreRepository theatreRepository;


    @PostMapping("/create")
    public ResponseEntity<Theatre> createTheatre(@RequestBody Theatre theatre){
        theatreRepository.save(theatre);
        return new ResponseEntity(Theatre , HttpStatus.CREATED);

    }
}
