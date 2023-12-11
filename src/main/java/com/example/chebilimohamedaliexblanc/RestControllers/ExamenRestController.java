package com.example.chebilimohamedaliexblanc.RestControllers;

import com.example.chebilimohamedaliexblanc.Entity.Aeroport;
import com.example.chebilimohamedaliexblanc.Entity.Vol;
import com.example.chebilimohamedaliexblanc.Services.IserviceExamen;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ExamenRestController {

    IserviceExamen iExamenService;

    @PostMapping("ajouter")
    public String ajouterVolEtAeroport(@RequestBody Vol vol,Aeroport aeroportDepart,Aeroport aeroportArrive ) {
        return iExamenService.ajouterVolEtAeroport(vol,aeroportDepart,aeroportArrive);
    }
}
