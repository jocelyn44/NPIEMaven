/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.npieunitesmaven;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author jocelynFac
 */
public class MainTest {
    
    public MainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of convertJoli method, of class Main.
     */
    
    Main main = new Main("src/main/java/com/mycompany/npieunitesmaven/conf.xml");
    
    @Test
    public void TestsJunit() {
		
		System.out.println();
		System.out.println("***** Tests sur les unites de distance *****");
		main.convertJoli((double)1, "distance", "metre", "kilometre");
		main.convertJoli((float) 1.3, "distance", "metre", "yard");
		main.convertJoli((float) 1, "distance", "metre", "inconnu");
		main.convertJoli((float) 1, "distance", "inconnu", "kilometre");
		main.convertJoli((float) 1, "distance", "metre", "yard");
		
		
		System.out.println();
		System.out.println("***** Tests sur les unites de vitesse *****");
		main.convertJoli((float) 1, "vitesse", "m/s", "noeud");
		main.convertJoli((float) 1, "vitesse", "m/s", "km/h");
		main.convertJoli((float) 1, "vitesse", "km/h", "mile/h");
		main.convertJoli((float) 1, "vitesse", "noeud", "km/h");
		main.convertJoli((float) 1, "vitesse", "km/h", "noeud");
		
		
		System.out.println();
		System.out.println("***** Tests sur les unites de poids *****");
		main.convertJoli((float) 1, "poids", "gramme", "tonne");
		main.convertJoli((float) 1, "poids", "kilogramme", "tonne");
		main.convertJoli((float) 1, "poids", "tonne", "kilogramme");
		main.convertJoli((float) 1, "poids", "tonne", "gramme");
		
		
		System.out.println();
		System.out.println("***** Tests sur les unites de volume *****");
		main.convertJoli((float) 1, "volume", "metre cube", "litre");
		main.convertJoli((float) 1, "volume", "litre", "metre cube");
		
		System.out.println();
		System.out.println("***** Tests sur les unites de surface *****");
		main.convertJoli((float)1, "surface", "metre carre", "hectare");
		main.convertJoli((float)1, "surface", "hectare", "millimetre carre");
		main.convertJoli((float)1, "surface", "decimetre carre", "millimetre carre");
		main.convertJoli((float)1, "surface", "metre carre", "centimetre carre");
		
		
		System.out.println();
		System.out.println("***** Tests sur les unites de temps *****");
		main.convertJoli((float)1, "temps", "seconde", "minute");
		main.convertJoli((float)1, "temps", "seconde", "siecle");
		main.convertJoli((float)1, "temps", "siecle", "minute");
		main.convertJoli((float)1, "temps", "jour", "minute");
		main.convertJoli((float)1, "temps", "seconde", "jour");
		
		
		System.out.println();
		System.out.println("***** Tests sur les unites de temprrature *****");
		main.convertJoli((float) 1, "temperature", "fahreneit", "celsius");
		main.convertJoli((float) 1, "temperature", "kelvin", "celsius");
		main.convertJoli((float) 1, "temperature", "fahreneit", "celsius");
		main.convertJoli((float) 1, "temperature", "celsius", "fahreneit");
		main.convertJoli((float) 1, "temperature", "celsius", "kelvin");
		main.convertJoli((float) 1, "temperature", "kelvin", "fahreneit");
		main.convertJoli((float) 1, "temperature", "fahreneit", "kelvin");
		
    }
    
    @Test
    public void testAjoutSupCate(){
        System.out.println();
		System.out.println("***** Tests d'ajout supression de categories *****");
		main.ajouterCate("newCate");
		main.ajouterUnite("newCate", "unit1", "1");
		main.ajouterUnite("newCate", "unit2", "10");
		main.convertJoli((float) 1, "newCate", "unit1", "unit2");
		main.supCate("newCate");
		main.convertJoli((float) 1, "newCate", "unit1", "unit2");
    }
    
    @Test
    public void testAjoutSupUnites(){
        
		System.out.println();
		System.out.println("***** Tests d'ajout supression d'unites *****");
		main.ajouterUnite("distance", "newUnit", "1.07324324;12");
		main.convertJoli((float) 1, "distance", "metre", "newUnit");
		main.supprimerUnite("distance", "newUnit");
		main.convertJoli((float) 1, "distance", "metre", "newUnit");
    }
    
    @Test
    public void testSpecifiques(){
                System.out.println();
		System.out.println("***** Tests specifiques *****");
                main.ajouterCate(null);
                main.ajouterUnite(null, null, null);
		main.setChemin(main.getChemin());
                main.setList(main.getList());
                main.convertJoli((float) 1, "temperature", "fahreneit", null);
                main.convertJoli((float) 1, "temperature", null, "fahreneit");
                main.convertJoli((float) 1, null, "fahreneit", "blabla");
    }
    
}
