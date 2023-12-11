package com.example.chebilimohamedaliexblanc.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Cascade;

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
public class Reservation {
    @Id
    String idReservation;
    @Enumerated(EnumType.STRING)
    EtatReservation etatReservation;
    @Enumerated(EnumType.STRING)
    ClassPlace classPlace;
    LocalDate datereservation;

    @ManyToOne
    (cascade=CascadeType.ALL)
    Vol vol;
    @ManyToOne(cascade=CascadeType.ALL)
    Voyageur voyageur;



}


