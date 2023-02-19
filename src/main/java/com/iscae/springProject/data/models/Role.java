package com.iscae.springProject.data.models;


import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private UserRoles nom;

    public Role() {

    }

    public Role(UserRoles nom) {
        this.nom = nom;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserRoles getNom() {
        return nom;
    }

    public void setNom(UserRoles nom) {
        this.nom = nom;
    }
}
