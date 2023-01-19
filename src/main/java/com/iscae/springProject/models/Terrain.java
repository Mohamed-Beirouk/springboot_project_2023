package com.iscae.springProject.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "terrains")
public class Terrain {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
    private Immobilier immobilierById;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Terrain terrain = (Terrain) o;
        return id == terrain.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Immobilier getImmobilierById() {
        return immobilierById;
    }

    public void setImmobilierById(Immobilier immobilierById) {
        this.immobilierById = immobilierById;
    }
}
