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
public class Inscription {
    private int id;
    private Classe classe;
    private Eleve eleve;

    public void setId(int id) {
        this.id = id;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public void setEleve(Eleve eleve) {
        this.eleve = eleve;
    }

    public int getId() {
        return id;
    }

    public Classe getClasse() {
        return classe;
    }

    public Eleve getEleve() {
        return eleve;
    }

    public Inscription(int id, Classe classe, Eleve eleve) {
        this.id = id;
        this.classe = classe;
        this.eleve = eleve;
    }
}
