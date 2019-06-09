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
    private DetailBulletin detail_bulletin;

    public Evaluation(int id, String aprreciation, double note, DetailBulletin detail_bulletin) {
        this.id = id;
        this.aprreciation = aprreciation;
        this.note = note;
        this.detail_bulletin = detail_bulletin;
    }

    public int getId() {
        return id;
    }

    public String getAprreciation() {
        return aprreciation;
    }

    public double getNote() {
        return note;
    }

    public DetailBulletin getDetail_bulletin() {
        return detail_bulletin;
    }
    
}
