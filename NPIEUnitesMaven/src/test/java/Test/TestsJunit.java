/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;

import com.mycompany.npieunitesmaven.Main;
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
public class TestsJunit {
    
    public TestsJunit() {
        Main main = new Main("src/main/java/com/mycompany/npieunitesmaven/config.xml");
        main.convertJoli((float) 1.3, "distance", "metre", "yard");
        main.ajouterUnite("distance", "newUnit", "1.07324324;12");
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
        main.supprimerUnite("distance", "newUnit");
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
