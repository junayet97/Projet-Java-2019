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
public class DAO_Trimestre extends DAO<Trimestre>{
    
    public DAO_Trimestre(Connexion co) 
    {
        super(co);
    }

  
  @Override
  public boolean create(Trimestre obj) {
    try{
        co.executeUpdate( "INSERT INTO trimestre(numero, debut,fin,id_anneescolaire) VALUES ('"+obj.getNumero()+"','"+obj.getDebut()+"','"+obj.getFin()+"','"+obj.getAnneeScolaire().getAnneeScolaire()+"')");
        return true;
    }
    catch(SQLException e){return false;}
  }

  @Override
  public boolean delete(Trimestre obj) {
    try{
        co.executeUpdate("DELETE FROM trimestre WHERE id_trimestre= "+obj.getId());
        return true;
    }
    catch(SQLException e){return false;}
  }
   
  @Override
  public boolean update(Trimestre obj) {
    try{
        co.executeUpdate("UPDATE trimestre SET numero= '"+obj.getNumero()+"', debut= '"+obj.getDebut()+"',fin= '"+obj.getFin()+"',id_anneescolaire= '"+obj.getAnneeScolaire().getAnneeScolaire()+"' WHERE id_trimestre= "+obj.getId());
        return true;
    }
    catch(SQLException e){return false;}
  }
  @Override
  public ArrayList<String> all() {
     try
     {  
         
         ArrayList<String> trimestres = co.remplirChampsRequete("SELECT * FROM trimestre WHERE 1");
         
         return trimestres;
         
     }
     catch(SQLException e){
         
         return null;}
  }
  @Override
  public Trimestre find(int id) {
     return null;    
  }
}
