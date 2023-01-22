package com.iscae.springProject.models;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Objects;

@Entity
@Table(name = "entrepots")
public class Entrepot {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;



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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entrepot entrepot = (Entrepot) o;
        return id == entrepot.id;
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
