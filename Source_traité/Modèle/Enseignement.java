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
public class Enseignement {
    private int id;
    private int id_discipline;
    private int id_enseignant;
    private int id_classe;

    public Enseignement(int id_discipline, int id_enseignant, int id_classe) {
        this.id = id;
        this.id_discipline = id_discipline;
        this.id_enseignant = id_enseignant;
        this.id_classe = id_classe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_discipline() {
        return id_discipline;
    }

    public void setId_discipline(int id_discipline) {
        this.id_discipline = id_discipline;
    }

    public int getId_enseignant() {
        return id_enseignant;
    }

    public void setId_enseignant(int id_enseignant) {
        this.id_enseignant = id_enseignant;
    }

    public int getId_classe() {
        return id_classe;
    }

    public void setId_classe(int id_classe) {
        this.id_classe = id_classe;
    }

   
}
