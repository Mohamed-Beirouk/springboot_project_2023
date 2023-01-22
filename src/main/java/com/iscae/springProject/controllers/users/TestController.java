package com.iscae.springProject.controllers.users;

import com.iscae.springProject.models.Immobilier;
import com.iscae.springProject.repositories.ImmobilierRepository;
import com.iscae.springProject.security.services.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {

    private final ImmobilierRepository immobilierRepository;

    @Autowired
    public TestController(ImmobilierRepository immobilierRepository) {
        this.immobilierRepository = immobilierRepository;
    }

    @GetMapping
    public List<Immobilier> getAll() {
        return immobilierRepository.findAll();
    }



    @GetMapping("/all")
    public String allAccess() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetailsImpl user = (UserDetailsImpl)authentication.getPrincipal();
        return user.getUsername()+" Public Content.";
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('USER') or hasRole('VENDEUR') or hasRole('ADMIN')")
    public String userAccess() {
        return "User Content.";
    }

    @GetMapping("/mod")
    @PreAuthorize("hasRole('VENDEUR')")
    public String moderatorAccess() {
        return "VENDEUR Board.";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminAccess() {
        return "Admin Board.";
    }
}