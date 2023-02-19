package com.iscae.springProject.data.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Objects;

@Entity
@Table(name = "immobiliers")
public class Immobilier {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;


    @Basic
    @Column(name = "altitude")
    private String altitude;

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

    @Basic
    @Column(name = "etat")
    private boolean etat;

    @Basic
    @Column(name = "prixjour")
    private Integer prixjour;



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
    @Column(name = "idp")
    private Long idp;

    @ManyToOne
    @JoinColumn(name = "idp", referencedColumnName = "id",nullable = false,
            insertable = false, updatable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private User usersByIdp;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLatitude() {
        return altitude;
    }

    public void setLatitude(String altitude) {
        this.altitude = altitude;
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


    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
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

    public Integer getPrixjour() {
        return prixjour;
    }

    public void setPrixjour(Integer prixjour) {
        this.prixjour = prixjour;
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
        Immobilier that = (Immobilier) o;
        return id == that.id && Objects.equals(altitude, that.altitude) && Objects.equals(longitude, that.longitude) && Objects.equals(reference, that.reference) && Objects.equals(type, that.type) && Objects.equals(superfice, that.superfice) && Objects.equals(description, that.description) && Objects.equals(idp, that.idp) && Objects.equals(wilaya, that.wilaya) && Objects.equals(departement, that.departement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, altitude, longitude, reference, type, superfice, description, idp, wilaya, departement);
    }


    public User getUsersByIdp() {
        return usersByIdp;
    }


}
