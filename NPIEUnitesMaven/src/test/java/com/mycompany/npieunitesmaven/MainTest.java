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
import static org.junit.Assert.*;

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
    
    Main main = new Main("src/main/java/com/mycompany/npieunitesmaven/config.xml");
    
    @Test
    public void TestsJunit() {
        main.convertJoli((float) 1.3, "distance", "metre", "yard");
        main.convertJoli((float) 1, "temperature", "fahreneit", "celsius");
        main.convertJoli((float) 1, "temperature", "kelvin", "celsius");
        main.convertJoli((float) 1, "distance", "metre", "kilometre");
        main.convertJoli((float) 1, "distance", "metre", "newUnit");
        main.convertJoli((float) 1, "temperature", "fahreneit", "celsius");
        main.convertJoli((float) 1, "temperature", "celsius", "fahreneit");
        main.convertJoli((float) 1, "distance", "metre", "inconnue");
        main.convertJoli((float) 1, "distance", "inconnue", "kilometre");
        main.convertJoli((float) 1, "distance", "metre", "yard");
        main.convertJoli((float) 1, "temperature", "celsius", "kelvin");
        main.convertJoli((float) 1, "temperature", "kelvin", "fahreneit");
        main.convertJoli((float) 1, "temperature", "fahreneit", "kelvin");
    }
    
    @Test
    public void testAjout(){
        main.ajouterUnite("distance", "newUnit", "1.07324324;12");
    }
    
    @Test
    public void testSupression(){
        main.supprimerUnite("distance", "newUnit");
    }
    
}
