package com.iscae.springProject.data.repositories;

import com.iscae.springProject.data.models.Role;
import com.iscae.springProject.data.models.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByNom(UserRoles nom);
}