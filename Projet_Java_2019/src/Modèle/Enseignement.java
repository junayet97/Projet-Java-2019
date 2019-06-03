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
    private Discipline discipline;
    private Enseignant enseignant;
    private Classe classe;

    public void setId(int id) {
        this.id = id;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public int getId() {
        return id;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public Classe getClasse() {
        return classe;
    }

    public Enseignement(int id, Discipline discipline, Enseignant enseignant, Classe classe) {
        this.id = id;
        this.discipline = discipline;
        this.enseignant = enseignant;
        this.classe = classe;
    }
}
