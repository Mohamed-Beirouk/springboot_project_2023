package com.iscae.springProject.models;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Objects;

@Entity
@Table(name = "maisons")
public class Maison {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "nbre_chambre")
    private Integer nbreChambre;
    @Basic
    @Column(name = "cuisine")
    private Integer cuisine;
    @Basic
    @Column(name = "jardin")
    private Integer jardin;
    @Basic
    @Column(name = "etage")
    private Integer etage;
    @Basic
    @Column(name = "garage")
    private Integer garage;


    @Basic
    @Column(name = "idi")
    private Long idi;

    @OneToOne
    @JoinColumn(name = "idi", referencedColumnName = "id",nullable = false,
            insertable = false, updatable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Immobilier immobilierById;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getNbreChambre() {
        return nbreChambre;
    }

    public void setNbreChambre(Integer nbreChambre) {
        this.nbreChambre = nbreChambre;
    }

    public Integer getCuisine() {
        return cuisine;
    }

    public void setCuisine(Integer cuisine) {
        this.cuisine = cuisine;
    }

    public Integer getJardin() {
        return jardin;
    }

    public void setJardin(Integer jardin) {
        this.jardin = jardin;
    }

    public Integer getEtage() {
        return etage;
    }

    public void setEtage(Integer etage) {
        this.etage = etage;
    }

    public Integer getGarage() {
        return garage;
    }

    public void setGarage(Integer garage) {
        this.garage = garage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Maison maison = (Maison) o;
        return id == maison.id && Objects.equals(nbreChambre, maison.nbreChambre) && Objects.equals(cuisine, maison.cuisine) && Objects.equals(jardin, maison.jardin) && Objects.equals(etage, maison.etage) && Objects.equals(garage, maison.garage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nbreChambre, cuisine, jardin, etage, garage);
    }

    public Immobilier getImmobilierById() {
        return immobilierById;
    }

    public void setImmobilierById(Immobilier immobilierById) {
        this.immobilierById = immobilierById;
    }
}
