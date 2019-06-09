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
public class DAO_Evaluation extends DAO<Evaluation>{
    
    public DAO_Evaluation(Connexion co) 
    {
        super(co);
    }

  
  @Override
  public boolean create(Evaluation obj) {
    try{
        co.executeUpdate( "INSERT INTO evaluation(id_detail, note, appreciation_eval) VALUES ('"+obj.getId_detail_bulletin()+"','"+obj.getNote()+"','"+obj.getAprreciation()+"')");
        return true;
    }
    catch(SQLException e){return false;}
  }

  @Override
  public boolean delete(Evaluation obj) {
    try{
        co.executeUpdate("DELETE FROM evaluation WHERE id_evaluation= "+obj.getId());
        return true;
    }
    catch(SQLException e){return false;}
  }
   
  @Override
  public boolean update(Evaluation obj) {
    try{
        co.executeUpdate("UPDATE evaluation SET id_detail= '"+obj.getId_detail_bulletin()+"', note= '"+obj.getNote()+"',appreciation_eval= '"+obj.getAprreciation()+"' WHERE id_evaluation= "+obj.getId());
        return true;
    }
    catch(SQLException e){return false;}
  }
  @Override
  public ArrayList<String> all() {
     try
     {  
         
         ArrayList<String> evaluations = co.remplirChampsRequete("SELECT * FROM evaluation WHERE 1");
         
         return evaluations;
         
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
         
         ArrayList<String> ids = co.remplirChampsRequete("SELECT id_evaluation FROM evaluation WHERE 1");
         
         return ids;
         
     }
     catch(SQLException e){
         
         return null;}  
   
  }
}