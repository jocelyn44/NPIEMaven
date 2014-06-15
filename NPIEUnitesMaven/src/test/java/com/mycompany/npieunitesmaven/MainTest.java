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
    
    Main instance = new Main("src/main/java/com/mycompany/npieunitesmaven/config.xml");
    
    @Test
    public void testConvertJoli() {
        System.out.println("convertJoli");
        float val = (float)13.4;
        String cate = "distance";
        String from = "metre";
        String to = "yard";
        instance.convertJoli(val, cate, from, to);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of convert method, of class Main.
     */
    @Test
    public void testConvert() {
        System.out.println("convert");
        float val = 0.0F;
        String cate = "";
        String from = "";
        String to = "";
        Main instance = null;
        float expResult = 0.0F;
        float result = instance.convert(val, cate, from, to);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toXml method, of class Main.
     */
    @Test
    public void testToXml() {
        System.out.println("toXml");
        Main instance = null;
        String expResult = "";
        String result = instance.toXml();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveStrXml method, of class Main.
     */
    @Test
    public void testSaveStrXml() {
        System.out.println("saveStrXml");
        String xml = "";
        Main instance = null;
        instance.saveStrXml(xml);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouterCate method, of class Main.
     */
    @Test
    public void testAjouterCate() {
        System.out.println("ajouterCate");
        String nomCate = "";
        Main instance = null;
        instance.ajouterCate(nomCate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of supCate method, of class Main.
     */
    @Test
    public void testSupCate() {
        System.out.println("supCate");
        String nomCate = "";
        Main instance = null;
        instance.supCate(nomCate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouterUnite method, of class Main.
     */
    @Test
    public void testAjouterUnite() {
        System.out.println("ajouterUnite");
        String categorie = "";
        String nomUnite = "";
        String valUnite = "";
        Main instance = null;
        instance.ajouterUnite(categorie, nomUnite, valUnite);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of supprimerUnite method, of class Main.
     */
    @Test
    public void testSupprimerUnite() {
        System.out.println("supprimerUnite");
        String categorie = "";
        String nomUnite = "";
        Main instance = null;
        instance.supprimerUnite(categorie, nomUnite);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
