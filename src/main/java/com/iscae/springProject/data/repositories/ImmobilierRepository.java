package com.iscae.springProject.data.repositories;

import com.iscae.springProject.data.models.Immobilier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImmobilierRepository extends JpaRepository<Immobilier, Long> {





}
