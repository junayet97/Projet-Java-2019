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
public class Bulletin {
    private int id;
    private String appreciation;
    private double moyenne;
    private Trimestre trimestre;
    private Inscription inscription;

    public void setId(int id) {
        this.id = id;
    }

    public void setAppreciation(String appreciation) {
        this.appreciation = appreciation;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    public void setTrimestre(Trimestre trimestre) {
        this.trimestre = trimestre;
    }

    public void setInscription(Inscription inscription) {
        this.inscription = inscription;
    }

    public int getId() {
        return id;
    }

    public String getAppreciation() {
        return appreciation;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public Trimestre getTrimestre() {
        return trimestre;
    }

    public Inscription getInscription() {
        return inscription;
    }

    public Bulletin(int id, String appreciation, double moyenne, Trimestre trimestre, Inscription inscription) {
        this.id = id;
        this.appreciation = appreciation;
        this.moyenne = moyenne;
        this.trimestre = trimestre;
        this.inscription = inscription;
    }
}
