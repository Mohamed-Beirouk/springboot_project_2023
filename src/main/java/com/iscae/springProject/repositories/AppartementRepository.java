package com.iscae.springProject.repositories;

import com.iscae.springProject.models.Appartement;
import com.iscae.springProject.models.Maison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AppartementRepository extends JpaRepository<Appartement, Long> {


}
