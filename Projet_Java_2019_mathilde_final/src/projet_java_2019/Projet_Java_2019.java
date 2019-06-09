/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_java_2019;
import Modèle.*;
import Graphique.*;
import java.util.*;
/**
 *
 * @author Junayet
 */
public class Projet_Java_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    { 
        try
        {
            Connexion co= new Connexion("java2019","root","");
            System.out.println(co.remplirChampsRequete("SELECT * FROM `personne` WHERE 1"));
        }
        catch(Exception e){System.out.println("Erreur BDD");
    }
    //new Menu_Principal();
    new co();
    }
    
}
