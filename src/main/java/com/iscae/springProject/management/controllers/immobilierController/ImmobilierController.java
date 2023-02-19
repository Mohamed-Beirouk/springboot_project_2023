package com.iscae.springProject.management.controllers.immobilierController;

import com.iscae.springProject.data.models.Immobilier;
import com.iscae.springProject.data.repositories.ImmobilierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
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

    @GetMapping("")
    public List<Immobilier> getAll() {
        return immobilierRepository.findAll();
    }

    @GetMapping("/{id}")
    public Immobilier getOne(@PathVariable("id") Long id ){
        return immobilierRepository.getOne(id);
    }


    @PostMapping("")
    public Immobilier add(@RequestBody Immobilier immo){
        return immobilierRepository.save(immo);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        immobilierRepository.deleteById(id);
    }



    @PutMapping("/{id}")
    public Immobilier update(@PathVariable("id") Long id, @RequestBody Immobilier immobilier){
        Immobilier existingImmobilier = immobilierRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Immobilier not found with id " + id));
        immobilierRepository.save(immobilier);
        return immobilierRepository.save(existingImmobilier);
    }

    @PutMapping("/changer_etat/{id}")
    public Immobilier updateEtat(@PathVariable("id") Long id) {
        Immobilier immobilierEntity = immobilierRepository.findById(id).orElseThrow();
        immobilierEntity.setEtat(false);
        return immobilierRepository.save(immobilierEntity);

    }
}
