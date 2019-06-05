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
public class DAO_AnneeScolaire extends DAO<AnneeScolaire> {
  public DAO_AnneeScolaire(Connexion co) {
    super(co);
  }

  
  @Override
  public boolean create(AnneeScolaire obj) {
    try{
        co.executeUpdate("INSERT INTO anneescolaire(id_anneescolaire) VALUES ("+obj.getAnneeScolaire()+")");
        return true;
    }
    catch(SQLException e){return false;}
  }

  @Override
  public boolean delete(AnneeScolaire obj) {
    try{
        co.executeUpdate("DELETE FROM anneescolaire WHERE id_anneescolaire = "+obj.getAnneeScolaire());
        return true;
    }
    catch(SQLException e){return false;}
  }
   
  @Override
  public boolean update(AnneeScolaire obj) {
    return false;
  }
  @Override
  public ArrayList<String> all() {
     try
     {  
         
         ArrayList<String> annee = co.remplirChampsRequete("SELECT * FROM anneescolaire WHERE 1");
         
         return annee;
         
     }
     catch(SQLException e){
         
         return null;}
  }
  @Override
  public AnneeScolaire find(int id) {
     return null;    
  }
   
  
}
