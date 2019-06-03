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
public class DetailBulletin {
    private int id;
    private String aprreciation;
    private double moyenne;
    private Bulletin bulletin;
    private Enseignement enseignement;

    public void setId(int id) {
        this.id = id;
    }

    public void setAprreciation(String aprreciation) {
        this.aprreciation = aprreciation;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    public void setBulletin(Bulletin bulletin) {
        this.bulletin = bulletin;
    }

    public void setEnseignement(Enseignement enseignement) {
        this.enseignement = enseignement;
    }

    public int getId() {
        return id;
    }

    public String getAprreciation() {
        return aprreciation;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public Bulletin getBulletin() {
        return bulletin;
    }

    public Enseignement getEnseignement() {
        return enseignement;
    }

    public DetailBulletin(int id, String aprreciation, double moyenne, Bulletin bulletin, Enseignement enseignement) {
        this.id = id;
        this.aprreciation = aprreciation;
        this.moyenne = moyenne;
        this.bulletin = bulletin;
        this.enseignement = enseignement;
    }
}
