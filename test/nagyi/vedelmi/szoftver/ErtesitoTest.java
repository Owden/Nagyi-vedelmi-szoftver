/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nagyi.vedelmi.szoftver;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pesta
 */
public class ErtesitoTest {
    Ertesito ertesito;
    
    public ErtesitoTest() {
    }
    
    @Before
    public void setUp() {        
    }

    /**
     * Test of ertesitsd method, of class Ertesito.
     */
    @Test
    public void testNagyiErtesitoHelyesUzenetetAdVissza() {
        Ertesito nagyiErtesito = new Ertesito(true);
        String uzenet = nagyiErtesito.uzenetLetrehozas("xy");
        assertEquals("Beütött a baj xyi irányból!", uzenet);
    }
    
    @Test
    public void testVadaszErtesitoHelyesUzenetetAdVissza() {
        Ertesito vadaszErtesito = new Ertesito(false);
        String uzenet = vadaszErtesito.uzenetLetrehozas("xy");
        assertEquals("A Nagyinál beütött a baj xyi irányból!", uzenet);
    }
}
