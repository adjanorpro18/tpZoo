package com.example.tpzoo.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tigre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    private String nom;
    private String couleur;
    private String race;
    private String type;
    private int age;

    public Tigre() {
    }

    public Tigre(String nom, String couleur, String race, String type, int age, Long id) {
        this.id = id;
        this.nom = nom;
        this.couleur = couleur;
        this.race = race;
        this.type = type;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Tigre{" +
                "id='" + id + '\'' +
                "nom='" + nom + '\'' +
                ", couleur='" + couleur + '\'' +
                ", race='" + race + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                '}';
    }
}
