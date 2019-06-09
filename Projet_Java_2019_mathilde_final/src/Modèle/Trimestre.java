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
public class Trimestre {
    private int id;
    private int numero;
    private String debut;
    private String fin;
    private AnneeScolaire annee_scolaire;

    public Trimestre(int id, int numero, String debut, String fin, AnneeScolaire annee_scolaire) {
        this.id = id;
        this.numero = numero;
        this.debut = debut;
        this.fin = fin;
        this.annee_scolaire = annee_scolaire;
    }

    
    
    
    public int getId() {
        return id;
    }


    public int getNumero() {
        return numero;
    }

    

    public String getDebut() {
        return debut;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDebut(String debut) {
        this.debut = debut;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public void setAnnee_scolaire(AnneeScolaire annee_scolaire) {
        this.annee_scolaire = annee_scolaire;
    }

    

    public String getFin() {
        return fin;
    }

    

    public AnneeScolaire getAnneeScolaire() {
        return annee_scolaire;
    }

   
    
    
    
}
