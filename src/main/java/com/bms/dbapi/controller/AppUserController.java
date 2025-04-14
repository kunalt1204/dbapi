package com.bms.dbapi.controller;


import com.bms.dbapi.models.AppUser;
import com.bms.dbapi.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/db/user")
public class AppUserController {

    @Autowired
    AppUserRepository appUserRepository;

    @PostMapping("/create")
    public ResponseEntity createUser(@RequestBody AppUser user){
        appUserRepository.save(user);
        return new ResponseEntity(user, HttpStatus.CREATED);
    }

    @GetMapping("/{userId}")
    public ResponseEntity getUserByID(@PathVariable UUID userId){

        AppUser user = appUserRepository.findById(userId).orElse(null);
        return new ResponseEntity(user,HttpStatus.OK);
    }


    @PutMapping("/update")
    public ResponseEntity updateUserById(@ResponseBody AppUser appUser){

        appUserRepository.save(appUser);
        return new ResponseEntity(appUser, HttpStatus.CREATED);

    }

    @DeleteMapping("/{userId}")
    public void deleteUserById(@PathVariable UUID userId){


    }





}
