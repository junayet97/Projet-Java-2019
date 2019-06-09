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
public class DAO_Eleve extends DAO<Eleve>{
    
    public DAO_Eleve(Connexion co) 
    {
        super(co);
    }

  
  @Override
  public boolean create(Eleve obj) {
    try{
        co.executeUpdate( "INSERT INTO personne(id_personne,nom_pers, prenom_pers, type_pers) VALUES ('"+obj.getId()+"','"+obj.getNom()+"','"+obj.getPrenom()+"','"+obj.type_perso()+"')");
        return true;
    }
    catch(SQLException e){return false;}
  }

  @Override
  public boolean delete(Eleve obj) {
    try{
        co.executeUpdate("DELETE FROM personne WHERE id_personne= '"+obj.getId()+"'AND type_pers='"+obj.type_perso()+"'");
        return true;
    }
    catch(SQLException e){return false;}
  }
   
  @Override
  public boolean update(Eleve obj) {
    try{
        co.executeUpdate("UPDATE personne SET nom_pers= '"+obj.getNom()+"', prenom_pers= '"+obj.getPrenom()+"',type_pers= '"+obj.type_perso()+"' WHERE id_personne= '"+obj.getId()+"'AND type_pers='"+obj.type_perso()+"'");
        return true;
    }
    
    catch(SQLException er){return false; }
  }
  @Override
  public ArrayList<String> all() {
     try
     {  
         
         ArrayList<String> eleves = co.remplirChampsRequete("SELECT * FROM personne WHERE type_pers= 'eleve'");
         
         return eleves;
         
     }
     catch(SQLException e){
         
         return null;}
  }
  
 
    
  
    @Override
  public ArrayList<String> getids() {
     try
     {  
         
         ArrayList<String> ids = co.remplirChampsRequete("SELECT id_personne FROM personne WHERE type_pers= 'eleve'");
         
         return ids;
         
     }
     catch(SQLException e){
         
         return null;}
  }
  @Override
  public ArrayList<String> find(int id) {
    try
     {  
         ArrayList<String> infos =null;
         infos = co.remplirChampsRequete("SELECT * FROM personne WHERE id_personne= '"+id+"'AND type_pers= 'eleve'");
         return infos;
         
         
     }
     catch(SQLException e){
         
         return null;}
  }
}


