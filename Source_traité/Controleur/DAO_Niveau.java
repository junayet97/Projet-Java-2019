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

public class DAO_Niveau extends DAO<Niveau>{
    
     public DAO_Niveau(Connexion co) 
    {
        super(co);
    }
     
     
  @Override
  public boolean create(Niveau obj) {
    try{
        co.executeUpdate( "INSERT INTO niveau(nom_niveau) VALUES ('"+obj.getNom()+"')");
        return true;
    }
    catch(SQLException e){return false;}
  }

  @Override
  public boolean delete(Niveau obj) {
    try{
        co.executeUpdate("DELETE FROM niveau WHERE id_niveau= "+obj.getId());
        return true;
    }
    catch(SQLException e){return false;}
  }
   
  @Override
  public boolean update(Niveau obj) {
    try{
        co.executeUpdate("UPDATE niveau SET nom_niveau= '"+obj.getNom()+"' WHERE id_niveau='"+obj.getId()+"'");
        return true;
    }
    catch(SQLException e){return false;}
  }
  @Override
  public ArrayList<String> all() {
     try
     {  
         
         ArrayList<String> niveaux = co.remplirChampsRequete("SELECT * FROM niveau WHERE 1");
         
         return niveaux;
         
     }
     catch(SQLException e){
         
         return null;}
  }
  @Override
  public ArrayList<String> find(int id) {
     return null;    
  }
  @Override
  public ArrayList<String> getids() {
     try
     {  
         
         ArrayList<String> ids = co.remplirChampsRequete("SELECT id_niveau FROM niveau WHERE 1");
         
         return ids;
         
     }
     catch(SQLException e){
         
         return null;}    
  }
}
