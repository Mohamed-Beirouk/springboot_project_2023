package com.iscae.springProject.models;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Objects;

@Entity
@Table(name = "appartements")
public class Appartement {
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
    @Column(name = "garage")
    private Integer garage;
    @Basic
    @Column(name = "prixjour")
    private Integer prixjour;

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

    public Integer getGarage() {
        return garage;
    }

    public void setGarage(Integer garage) {
        this.garage = garage;
    }

    public Integer getPrixjour() {
        return prixjour;
    }

    public void setPrixjour(Integer prixjour) {
        this.prixjour = prixjour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appartement that = (Appartement) o;
        return id == that.id && Objects.equals(nbreChambre, that.nbreChambre) && Objects.equals(cuisine, that.cuisine) && Objects.equals(garage, that.garage) && Objects.equals(prixjour, that.prixjour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nbreChambre, cuisine, garage, prixjour);
    }

    public Immobilier getImmobilierById() {
        return immobilierById;
    }

    public void setImmobilierById(Immobilier immobilierById) {
        this.immobilierById = immobilierById;
    }
}
