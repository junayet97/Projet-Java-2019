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
public class DAO_DetailBulletin extends DAO<DetailBulletin>
{
   
public DAO_DetailBulletin(Connexion co) 
    {
        super(co);
    }

  
  @Override
  public boolean create(DetailBulletin obj) {
    try{
        co.executeUpdate( "INSERT INTO detailbulletin(id_bulltetin, id_enseignement,	appreciation_det, moyenne) VALUES ('"+obj.getBulletin().getId()+"','"+obj.getEnseignement().getId()+"','"+obj.getAprreciation()+"','"+obj.getMoyenne()+"')");
        return true;
    }
    catch(SQLException e){return false;}
  }

  @Override
  public boolean delete(DetailBulletin obj) {
    try{
        co.executeUpdate("DELETE FROM detailbulletin WHERE id_detail= "+obj.getId());
        return true;
    }
    catch(SQLException e){return false;}
  }
   
  @Override
  public boolean update(DetailBulletin obj) {
    try{
        co.executeUpdate("UPDATE detailbulletin SET id_bulltetin= '"+obj.getBulletin().getId()+"', id_enseignement= '"+obj.getEnseignement().getId()+"',appreciation_det= '"+obj.getAprreciation()+"',moyenne= '"+obj.getMoyenne()+"' WHERE id_detail= "+obj.getId());
        return true;
    }
    catch(SQLException e){return false;}
  }
  @Override
  public ArrayList<String> all() {
     try
     {  
         
         ArrayList<String> details = co.remplirChampsRequete("SELECT * FROM detailbulletin WHERE 1");
         
         return details;
         
     }
     catch(SQLException e){
         
         return null;}
  }
  @Override
  public DetailBulletin find(int id) {
     return null;    
  }
}
