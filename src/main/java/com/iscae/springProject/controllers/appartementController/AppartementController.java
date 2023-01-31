package com.iscae.springProject.controllers.appartementController;


import com.iscae.springProject.models.Appartement;
import com.iscae.springProject.models.Maison;
import com.iscae.springProject.repositories.AppartementRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600000)
@RestController
@RequestMapping("/api/appartement")
public class AppartementController {

    private final AppartementRepository appartementRepository;

    public AppartementController(AppartementRepository appartementRepository) {
        this.appartementRepository = appartementRepository;
    }

    @GetMapping("/getall")
    public List<Appartement> getAll() {
        return appartementRepository.findAll();
    }



    @GetMapping("/getone/{id}")
    public Appartement getOne(@PathVariable("id") Long id ){
        return appartementRepository.getOne(id);
    }

    @PostMapping("/add")
    public Appartement add(@RequestBody Appartement appartement){
        return appartementRepository.save(appartement);
    }

}
