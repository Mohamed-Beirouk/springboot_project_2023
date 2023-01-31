package com.iscae.springProject.repositories;

import com.iscae.springProject.models.Role;
import com.iscae.springProject.models.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByNom(UserRoles nom);
}