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
public class DAO_Inscription extends DAO<Inscription>{
    
    public DAO_Inscription(Connexion co) 
    {
        super(co);
    }

  
  @Override
  public boolean create(Inscription obj) {
    try{
        co.executeUpdate( "INSERT INTO inscription(id_classe, id_personne) VALUES ('"+obj.getClasse().getId()+"','"+obj.getEleve().getId()+"')");
        return true;
    }
    catch(SQLException e){return false;}
  }

  @Override
  public boolean delete(Inscription obj) {
    try{
        co.executeUpdate("DELETE FROM inscription WHERE id_inscription= "+obj.getId());
        return true;
    }
    catch(SQLException e){return false;}
  }
   
  @Override
  public boolean update(Inscription obj) {
    try{
        co.executeUpdate("UPDATE inscription SET id_classe= '"+obj.getClasse().getId()+"', id_personne= '"+obj.getEleve().getId()+"' WHERE id_inscription= "+obj.getId());
        return true;
    }
    catch(SQLException e){return false;}
  }
  @Override
  public ArrayList<String> all() {
     try
     {  
         
         ArrayList<String> inscriptions = co.remplirChampsRequete("SELECT * FROM inscription WHERE 1");
         
         return inscriptions;
         
     }
     catch(SQLException e){
         
         return null;}
  }
  @Override
  public Inscription find(int id) {
     return null;    
  }
}
