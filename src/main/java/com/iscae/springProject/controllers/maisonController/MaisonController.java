package com.iscae.springProject.controllers.maisonController;

import com.iscae.springProject.models.Immobilier;
import com.iscae.springProject.models.Maison;
import com.iscae.springProject.repositories.ImmobilierRepository;
import com.iscae.springProject.repositories.MaisonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600000)
@RestController
@RequestMapping("/api/maison")
public class MaisonController {
    private final MaisonRepository maisonRepository;

    @Autowired
    public MaisonController(MaisonRepository maisonRepository) {
        this.maisonRepository = maisonRepository;
    }

    @GetMapping("/getall")
    public List<Maison> getAll() {
        return maisonRepository.findAll();
    }


    @GetMapping("/getone/{id}")
    public Maison getOne(@PathVariable("id") Long id ){
        return maisonRepository.getOne(id);
    }

    @PostMapping("/add")
    public Maison add(@RequestBody Maison maison){
        return maisonRepository.save(maison);
    }

}
