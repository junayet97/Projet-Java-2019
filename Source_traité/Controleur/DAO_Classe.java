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
public class DAO_Classe extends DAO<Classe>{
    
    public DAO_Classe(Connexion co) 
    {
        super(co);
    }

  
  @Override
  public boolean create(Classe obj) {
    try{
        co.executeUpdate( "INSERT INTO classe(nom_classe, id_anneescolaire,id_niveau) VALUES ('"+obj.getNom()+"','"+obj.getAnneeScolaire()+"','"+obj.getId_niveau()+"')");
        return true;
    }
    catch(SQLException e){return false;}
  }

  @Override
  public boolean delete(Classe obj) {
    try{
        co.executeUpdate("DELETE FROM classe WHERE id_classe= "+obj.getId());
        return true;
    }
    catch(SQLException e){return false;}
  }
   
  @Override
  public boolean update(Classe obj) {
    try{
        co.executeUpdate("UPDATE classe SET nom_classe= '"+obj.getNom()+"'WHERE id_classe= "+obj.getId());
        return true;
    }
    catch(SQLException e){return false;}
  }
  @Override
  public ArrayList<String> all() {
     try
     {  
         
         ArrayList<String> classes = co.remplirChampsRequete("SELECT * FROM classe WHERE 1");
         
         return classes;
         
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
         
         ArrayList<String> ids = co.remplirChampsRequete("SELECT id_classe FROM classe WHERE 1");
         
         return ids;
         
     }
     catch(SQLException e){
         
         return null;}  
  }
}
