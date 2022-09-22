package com.findajob.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.findajob.backend.entities.Aplication;

@Repository
public interface AplicationRepository extends JpaRepository <Aplication,Integer>{
    
}
