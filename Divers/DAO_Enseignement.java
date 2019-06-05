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
        co.executeUpdate( "INSERT INTO enseignement(id_classe,	id_discipline,	id_personne) VALUES ('"+obj.getClasse().getId()+"','"+obj.getDiscipline().getId()+"','"+obj.getEnseignant().getId()+"')");
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
        co.executeUpdate("UPDATE enseignement SET id_classe= '"+obj.getClasse().getId()+"',id_discipline= '"+obj.getDiscipline().getId()+"', id_personne= '"+obj.getEnseignant().getId()+"' WHERE id_enseignement= "+obj.getId());
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
  public Enseignement find(int id) {
     return null;    
  }
}