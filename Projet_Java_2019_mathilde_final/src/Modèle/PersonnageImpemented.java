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
public class PersonnageImpemented implements Personne{
    protected int Id;
    protected String Nom;
    protected String Prenom;
    protected String type;
    
    public PersonnageImpemented(int Id, String Nom, String Prenom)
    {
        this.Id=Id;
        this.Nom=Nom;
        this.Prenom=Prenom;
        
    }
    
    @Override
    public int getId(){
        return Id;
    }
    
    @Override
    public String getNom(){
        return Nom;
    }
    
    @Override
    public String getPrenom(){
        return Prenom;
    }
    @Override
    public String type_perso(){
        return type;
    }
}
