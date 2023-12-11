package com.example.chebilimohamedaliexblanc.Services;

import com.example.chebilimohamedaliexblanc.Entity.Aeroport;
import com.example.chebilimohamedaliexblanc.Entity.Vol;
import com.example.chebilimohamedaliexblanc.Entity.Voyageur;
import com.example.chebilimohamedaliexblanc.Repository.AeroportRepository;
import com.example.chebilimohamedaliexblanc.Repository.VolRepository;

import java.util.List;

public class ExamenServices {

    AeroportRepository aeroportRepository;
    VolRepository volRepository;


    public String ajouterVolEtAeroport(Vol vol, Aeroport aeroportDepart, Aeroport aeroportArrive) {
        aeroportRepository.save(aeroportDepart);
        aeroportRepository.save(aeroportArrive);
        vol.setAeroport(aeroportDepart);
        vol.setAeroport(aeroportArrive);

        volRepository.save(vol);
        return "Ajouter";

    }




}
