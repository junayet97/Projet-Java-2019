/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modèle;

/**
 *
 * @author Juju
 */
public class Classe {
    private int id;
    private String nom;
    private AnneeScolaire AnneeScolaire;
    private Niveau niveau;

    public Classe(int id, String nom, AnneeScolaire AnneeScolaire, Niveau niveau) {
        this.id = id;
        this.nom = nom;
        this.AnneeScolaire = AnneeScolaire;
        this.niveau = niveau;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public AnneeScolaire getAnneeScolaire() {
        return AnneeScolaire;
    }

    public Niveau getNiveau() {
        return niveau;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAnneeScolaire(AnneeScolaire AnneeScolaire) {
        this.AnneeScolaire = AnneeScolaire;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }
    
}
