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
public class Eleve extends PersonnageImpemented {
     
    public Eleve(int Id, String Nom, String Prenom)
    {
        super(Id,Nom,Prenom);
        type="eleve";
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }
    
}
