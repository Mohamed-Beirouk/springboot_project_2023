package com.iscae.springProject.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "immobiliers")
public class Immobilier {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "latitude")
    private String latitude;
    @Basic
    @Column(name = "longitude")
    private String longitude;
    @Basic
    @Column(name = "reference")
    private String reference;
    @Basic
    @Column(name = "type")
    private String type;
    @Basic
    @Column(name = "superfice")
    private Integer superfice;
    @Basic
    @Column(name = "description")
    private String description;


    @Basic
    @Column(name = "wilaya")
    private String wilaya;
    @Basic
    @Column(name = "departement")
    private String departement;


    @OneToOne(mappedBy = "immobilierById")
    private Appartement appartementById;
    @OneToOne(mappedBy = "immobilierById")
    private Entrepot entrepotById;


    @Basic
    @Column(name = "idp")
    private Long idp;

    @ManyToOne
    @JoinColumn(name = "idp", referencedColumnName = "id",nullable = false,
            insertable = false, updatable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User usersByIdp;

    @OneToOne(mappedBy = "immobilierById")
    private Maison maisonById;
    @OneToOne(mappedBy = "immobilierById")
    private Studio studioById;
    @OneToOne(mappedBy = "immobilierById")
    private Terrain terrainById;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getSuperfice() {
        return superfice;
    }

    public void setSuperfice(Integer superfice) {
        this.superfice = superfice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getIdp() {
        return idp;
    }

    public void setIdp(Long idp) {
        this.idp = idp;
    }

    public String getWilaya() {
        return wilaya;
    }

    public void setWilaya(String wilaya) {
        this.wilaya = wilaya;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Immobilier that = (Immobilier) o;
        return id == that.id && Objects.equals(latitude, that.latitude) && Objects.equals(longitude, that.longitude) && Objects.equals(reference, that.reference) && Objects.equals(type, that.type) && Objects.equals(superfice, that.superfice) && Objects.equals(description, that.description) && Objects.equals(idp, that.idp) && Objects.equals(wilaya, that.wilaya) && Objects.equals(departement, that.departement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, latitude, longitude, reference, type, superfice, description, idp, wilaya, departement);
    }

    public Appartement getAppartementById() {
        return appartementById;
    }

    public void setAppartementById(Appartement appartementById) {
        this.appartementById = appartementById;
    }

    public Entrepot getEntrepotById() {
        return entrepotById;
    }

    public void setEntrepotById(Entrepot entrepotById) {
        this.entrepotById = entrepotById;
    }

    public User getUsersByIdp() {
        return usersByIdp;
    }

    public void setUsersByIdp(User usersByIdp) {
        this.usersByIdp = usersByIdp;
    }

    public Maison getMaisonById() {
        return maisonById;
    }

    public void setMaisonById(Maison maisonById) {
        this.maisonById = maisonById;
    }


    public Studio getStudioById() {
        return studioById;
    }

    public void setStudioById(Studio studioById) {
        this.studioById = studioById;
    }

    public Terrain getTerrainById() {
        return terrainById;
    }

    public void setTerrainById(Terrain terrainById) {
        this.terrainById = terrainById;
    }
}
