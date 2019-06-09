/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import Modèle.*;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Junayet
 */
public class DAO_Enseignant extends DAO<Enseignant>{
    
    public DAO_Enseignant(Connexion co) 
    {
        super(co);
    }

  
  @Override
  public boolean create(Enseignant obj) {
    try{
        co.executeUpdate( "INSERT INTO personne(id_personne,nom_pers, prenom_pers, type_pers) VALUES ('"+obj.getId()+"','"+obj.getNom()+"','"+obj.getPrenom()+"','"+obj.type_perso()+"')");
        return true;
    }
    catch(SQLException e){return false;}
  }

  @Override
  public boolean delete(Enseignant obj) {
    try{
        co.executeUpdate("DELETE FROM personne WHERE id_personne= '"+obj.getId()+"'AND type_pers='"+obj.type_perso()+"'");
        return true;
    }
    catch(SQLException e){return false;}
  }
   
  @Override
  public boolean update(Enseignant obj) {
    try{
        co.executeUpdate("UPDATE personne SET nom_pers= '"+obj.getNom()+"', prenom_pers= '"+obj.getPrenom()+"',type_pers= '"+obj.type_perso()+"' WHERE id_personne= '"+obj.getId()+"'AND type_pers= '"+obj.type_perso()+"'" );
        return true;
    }
    catch(SQLException e){return false;}
  }
  @Override
  public ArrayList<String> all() {
     try
     {  
         
         ArrayList<String> enseignants = co.remplirChampsRequete("SELECT * FROM personne WHERE 1");
         
         return enseignants;
         
     }
     catch(SQLException e){
         
         return null;}
  }
  @Override
  public  ArrayList<String> find(int id) {
     return null;    
  }
  @Override
  public ArrayList<String> getids() {
    try
     {  
         
         ArrayList<String> ids = co.remplirChampsRequete("SELECT id_personne FROM personne WHERE 1");
         
         return ids;
         
     }
     catch(SQLException e){
         
         return null;}
  }
  
}
