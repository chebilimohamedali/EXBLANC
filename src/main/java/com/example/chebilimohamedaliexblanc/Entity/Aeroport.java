package com.example.chebilimohamedaliexblanc.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Aeroport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idAeroport;
    String nom;
    String codeAITA;
    long telephone ;
    @OneToMany(mappedBy = "aeroport")
    private Set<Vol> vols;


}
