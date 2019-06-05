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
public class DAO_Discipline extends DAO<Discipline>{
    
      public DAO_Discipline(Connexion co) 
    {
        super(co);
    }

  
  @Override
  public boolean create(Discipline obj) {
    try{
        co.executeUpdate( "INSERT INTO discipline(nom_discipline) VALUES ('"+obj.getNom()+"')");
        return true;
    }
    catch(SQLException e){return false;}
  }

  @Override
  public boolean delete(Discipline obj) {
    try{
        co.executeUpdate("DELETE FROM discipline WHERE id_discipline= "+obj.getId());
        return true;
    }
    catch(SQLException e){return false;}
  }
   
  @Override
  public boolean update(Discipline obj) {
    try{
        co.executeUpdate("UPDATE classe SET nom_discipline= '"+obj.getNom()+"'WHERE id_discipline= "+obj.getId());
        return true;
    }
    catch(SQLException e){return false;}
  }
  @Override
  public ArrayList<String> all() {
     try
     {  
         
         ArrayList<String> disciplines = co.remplirChampsRequete("SELECT * FROM discipline WHERE 1");
         
         return disciplines;
         
     }
     catch(SQLException e){
         
         return null;}
  }
  @Override
  public Discipline find(int id) {
     return null;    
  }
}
