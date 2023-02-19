package com.iscae.springProject.management.controllers.users;

import com.iscae.springProject.data.repositories.ImmobilierRepository;
import com.iscae.springProject.security.services.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600000)
@RestController
@RequestMapping("/api/stat")
public class StatApis {
    private final ImmobilierRepository immobilierRepository;
    @Autowired
    public StatApis(ImmobilierRepository immobilierRepository) {
        this.immobilierRepository = immobilierRepository;
    }

    @GetMapping("")
    public String stats() {
        return " Public Content";
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('ADMIN')")
    public String userAccess() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetailsImpl user = (UserDetailsImpl)authentication.getPrincipal();

        return user.getUsername()+" User Content.";
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