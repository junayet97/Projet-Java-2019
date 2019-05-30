/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_java_2019;
import Modèle.*;
import Graphique.*;
/**
 *
 * @author Junayet
 */
public class Projet_Java_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        try{Connexion connec= new Connexion("ece_amazon","root","");}
        catch(Exception e){System.out.println("erreur BDD");}
        new Menu_Principal();
    }
    
}
