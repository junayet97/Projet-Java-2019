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
public class Evaluation {
    private int id;
    private String aprreciation;
    private double note;
    private int id_detail_bulletin;

    public Evaluation(int id, String aprreciation, double note, int id_detail_bulletin) {
        this.id = id;
        this.aprreciation = aprreciation;
        this.note = note;
        this.id_detail_bulletin = id_detail_bulletin;
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

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public int getId_detail_bulletin() {
        return id_detail_bulletin;
    }

    public void setId_detail_bulletin(int id_detail_bulletin) {
        this.id_detail_bulletin = id_detail_bulletin;
    }

   
    
}
