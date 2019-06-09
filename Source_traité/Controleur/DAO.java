/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;
import Modèle.*;
import java.util.ArrayList;
/**
 *
 * @author Junayet
 * @param <T>
 */





public abstract class DAO<T> {
  protected Connexion co = null;
   
  public DAO(Connexion co){
    this.co = co;
  }
   
  /**
  * Méthode de création
  * @param obj
  * @return boolean 
  */
  public abstract boolean create(T obj);

  /**
  * Méthode pour effacer
  * @param obj
  * @return boolean 
  */
  public abstract boolean delete(T obj);

  /**
  * Méthode de mise à jour
  * @param obj
  * @return boolean
  */
  public abstract boolean update(T obj);

  /**
  * Méthode de recherche des informations
  * @param id
  * @return T
  */
  public abstract ArrayList<String> all();
  public abstract ArrayList<String> getids();
  public abstract ArrayList<String> find(int id);
}