package com.example.chebilimohamedaliexblanc.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.DatabindException;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Voyageur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idVoyageur;
    String nom;
    String prenom;
    LocalDate date ;
    @OneToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    List<Reservation> reservations= new ArrayList<>();
}
