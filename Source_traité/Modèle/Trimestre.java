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
    private int Annee_Scolaire;

    public Trimestre(int id, int numero, String debut, String fin, int Annee_Scolaire) {
        this.id = id;
        this.numero = numero;
        this.debut = debut;
        this.fin = fin;
        this.Annee_Scolaire = Annee_Scolaire;
    }

    public Trimestre(int numero, String debut, String fin, int Annee_Scolaire) {
        this.numero = numero;
        this.debut = debut;
        this.fin = fin;
        this.Annee_Scolaire = Annee_Scolaire;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDebut() {
        return debut;
    }

    public void setDebut(String debut) {
        this.debut = debut;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public int getAnnee_Scolaire() {
        return Annee_Scolaire;
    }

    public void setAnnee_Scolaire(int Annee_Scolaire) {
        this.Annee_Scolaire = Annee_Scolaire;
    }

   

   
    
    
    
}
