/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modèle;

/**
 *
 * @author Junayet
 */
public class Classe {
    private int id;
    private String nom;
    private int AnneeScolaire;
    private int id_niveau;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAnneeScolaire() {
        return AnneeScolaire;
    }

    public void setAnneeScolaire(int AnneeScolaire) {
        this.AnneeScolaire = AnneeScolaire;
    }

    public int getId_niveau() {
        return id_niveau;
    }

    public void setId_niveau(int id_niveau) {
        this.id_niveau = id_niveau;
    }
public Classe(int id, String nom, int AnneeScolaire, int id_niveau) {
        this.id = id;
        this.nom = nom;
        this.AnneeScolaire = AnneeScolaire;
        this.id_niveau = id_niveau;
    }
    public Classe(String nom, int AnneeScolaire, int id_niveau) {
      
        this.nom = nom;
        this.AnneeScolaire = AnneeScolaire;
        this.id_niveau = id_niveau;
    }


  
    

   
    
}
