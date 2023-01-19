package com.iscae.springProject.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "studios")
public class Studio {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "nbre_chambre")
    private Integer nbreChambre;
    @Basic
    @Column(name = "prixjour")
    private Integer prixjour;
    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
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
        Studio studio = (Studio) o;
        return id == studio.id && Objects.equals(nbreChambre, studio.nbreChambre) && Objects.equals(prixjour, studio.prixjour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nbreChambre, prixjour);
    }

    public Immobilier getImmobilierById() {
        return immobilierById;
    }

    public void setImmobilierById(Immobilier immobilierById) {
        this.immobilierById = immobilierById;
    }
}
