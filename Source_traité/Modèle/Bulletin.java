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
    private int id_trimestre;
    private int id_inscription;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAppreciation() {
        return appreciation;
    }

    public void setAppreciation(String appreciation) {
        this.appreciation = appreciation;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    public int getId_trimestre() {
        return id_trimestre;
    }

    public void setId_trimestre(int id_trimestre) {
        this.id_trimestre = id_trimestre;
    }

    public int getId_inscription() {
        return id_inscription;
    }

    public void setId_inscription(int id_inscription) {
        this.id_inscription = id_inscription;
    }

    public Bulletin(int id, String appreciation, double moyenne, int id_trimestre, int id_inscription) {
        this.id = id;
        this.appreciation = appreciation;
        this.moyenne = moyenne;
        this.id_trimestre = id_trimestre;
        this.id_inscription = id_inscription;
    }

    public Bulletin(String appreciation, int id_trimestre, int id_inscription) {
        this.appreciation = appreciation;
        this.id_trimestre = id_trimestre;
        this.id_inscription = id_inscription;
    }
    
    
    
}
