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
    private int id_bulletin;
    private int id_enseignement;

    public DetailBulletin(int id, String aprreciation, double moyenne, int id_bulletin, int id_enseignement) {
        this.id = id;
        this.aprreciation = aprreciation;
        this.moyenne = moyenne;
        this.id_bulletin = id_bulletin;
        this.id_enseignement = id_enseignement;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAprreciation() {
        return aprreciation;
    }

    public void setAprreciation(String aprreciation) {
        this.aprreciation = aprreciation;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    public int getId_bulletin() {
        return id_bulletin;
    }

    public void setId_bulletin(int id_bulletin) {
        this.id_bulletin = id_bulletin;
    }

    public int getId_enseignement() {
        return id_enseignement;
    }

    public void setId_enseignement(int id_enseignement) {
        this.id_enseignement = id_enseignement;
    }

    

    
}
