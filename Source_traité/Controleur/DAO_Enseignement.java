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
public class DAO_Enseignement extends DAO<Enseignement>{
    
    public DAO_Enseignement(Connexion co) 
    {
        super(co);
    }

  
  @Override
  public boolean create(Enseignement obj) {
    try{
        co.executeUpdate( "INSERT INTO enseignement(id_classe,	id_discipline,	id_personne) VALUES ('"+obj.getId_classe()+"','"+obj.getId_discipline()+"','"+obj.getId_enseignant()+"')");
        return true;
    }
    catch(SQLException e){return false;}
  }

  @Override
  public boolean delete(Enseignement obj) {
    try{
        co.executeUpdate("DELETE FROM enseignement WHERE id_enseignement= "+obj.getId());
        return true;
    }
    catch(SQLException e){return false;}
  }
   
  @Override
  public boolean update(Enseignement obj) {
    try{
        co.executeUpdate("UPDATE enseignement SET id_classe= '"+obj.getId_classe()+"',id_discipline= '"+obj.getId_discipline()+"', id_personne= '"+obj.getId_enseignant()+"' WHERE id_enseignement= "+obj.getId());
        return true;
    }
    catch(SQLException e){return false;}
  }
  @Override
  public ArrayList<String> all() {
     try
     {  
         
         ArrayList<String> enseignements = co.remplirChampsRequete("SELECT * FROM enseignement WHERE 1");
         
         return enseignements;
         
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
         
         ArrayList<String> ids = co.remplirChampsRequete("SELECT id_enseignement FROM enseignement WHERE 1");
         
         return ids;
         
     }
     catch(SQLException e){
         
         return null;} 
  }
}