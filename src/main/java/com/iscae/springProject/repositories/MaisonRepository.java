package com.iscae.springProject.repositories;

import com.iscae.springProject.models.Immobilier;
import com.iscae.springProject.models.Maison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MaisonRepository extends JpaRepository<Maison, Long> {
}
