package com.iscae.springProject.repositories;

import com.iscae.springProject.models.Immobilier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public interface ImmobilierRepository extends JpaRepository<Immobilier, Long> {



}
