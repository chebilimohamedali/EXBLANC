package com.example.chebilimohamedaliexblanc.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Fourinisseur {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    long id ;
    String nom;
}
