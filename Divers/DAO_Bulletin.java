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
        co.executeUpdate( "INSERT INTO bulletin(id_trimestre, id_inscription,appreciation, moyenne_trimestre) VALUES ('"+obj.getTrimestre().getId()+"','"+obj.getInscription().getId()+"','"+obj.getAppreciation()+"','"+obj.getMoyenne()+"')");
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
        co.executeUpdate("UPDATE bulletin SET id_trimestre= '"+obj.getTrimestre().getId()+"',id_inscription= '"+obj.getInscription().getId()+"',appreciation= '"+obj.getAppreciation()+"',moyenne_trimestre= '"+obj.getMoyenne()+"' WHERE id_bulletin= "+obj.getId());
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
  public Bulletin find(int id) {
     return null;    
  }
   
}
