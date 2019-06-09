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
public class DAO_Bulletin extends DAO<Bulletin> {
     
    public DAO_Bulletin(Connexion co) 
    {
        super(co);
    }

  
  @Override
  public boolean create(Bulletin obj) {
    try{
        ArrayList<String> moy = co.remplirChampsRequete("SELECT AVG(moyenne) FROM detailbulletin");
        System.out.println(moy);
        co.executeUpdate( "INSERT INTO bulletin(id_trimestre, id_inscription,appreciation) VALUES ('"+obj.getId_trimestre()+"','"+obj.getId_inscription()+"','"+obj.getAppreciation()+"')");
        return true;
    }
    catch(SQLException e){return false;}
  }

  @Override
  public boolean delete(Bulletin obj) {
    try{
        co.executeUpdate("DELETE FROM bulletin WHERE id_bulletin= "+obj.getId());
        return true;
    }
    catch(SQLException e){return false;}
  }
   
  @Override
  public boolean update(Bulletin obj) {
    try{
        co.executeUpdate("UPDATE bulletin SET appreciation= '"+obj.getAppreciation()+"' WHERE id_bulletin= "+obj.getId());
        return true;
    }
    catch(SQLException e){return false;}
  }
  @Override
  public ArrayList<String> all() {
     try
     {  
         
         ArrayList<String> annee = co.remplirChampsRequete("SELECT * FROM bulletin WHERE 1");
         
         return annee;
         
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
         
         ArrayList<String> ids = co.remplirChampsRequete("SELECT id_bulletin FROM bulletin WHERE 1");
         
         return ids;
         
     }
     catch(SQLException e){
         
         return null;}  
   
  }
   
}
