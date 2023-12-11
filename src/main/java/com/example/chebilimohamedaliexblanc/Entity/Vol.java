package com.example.chebilimohamedaliexblanc.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Vol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idVol;
    LocalDate dateDepart;
    LocalDate dateArrive;
     LocalDate date ;

    @ManyToOne
    @JoinColumn(name = "idAeroport")
    private Aeroport aeroport;

}
