package com.iscae.springProject.controllers.immobilierController;

import com.iscae.springProject.models.Immobilier;
import com.iscae.springProject.repositories.ImmobilierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600000)
@RestController
@RequestMapping("/api/immobilier")
public class ImmobilierController {

    private final ImmobilierRepository immobilierRepository;


    @Autowired
    public ImmobilierController(ImmobilierRepository immobilierRepository) {
        this.immobilierRepository = immobilierRepository;
    }


    @GetMapping("/getall")
    public List<Immobilier> getAll() {
        return immobilierRepository.findAll();
    }

    @PostMapping("/add")
    public Immobilier add(@RequestBody Immobilier immo){
        return immobilierRepository.save(immo);
    }


    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        immobilierRepository.deleteById(id);
    }

}
