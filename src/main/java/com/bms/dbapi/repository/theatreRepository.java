package com.bms.dbapi.repository;

import com.bms.dbapi.models.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface theatreRepository extends JpaRepository<Theatre, UUID> {


}
