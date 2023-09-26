package tn.esprit.springproject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
@Entity
public class Universite implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private long idUniversite;
    private String nomUniversite;
    private String adresseUniversite;

    public long getIdUniversite() {
        return idUniversite;
    }

    public void setIdUniversite(long idUniversite) {
        this.idUniversite = idUniversite;
    }

    public void setNomUniversite(String nomUniversite) {
        this.nomUniversite = nomUniversite;
    }

    public void setAdresseUniversite(String adresseUniversite) {
        this.adresseUniversite = adresseUniversite;
    }

    public String getNomUniversite() {
        return nomUniversite;
    }

    public String getAdresseUniversite() {
        return adresseUniversite;
    }
}
