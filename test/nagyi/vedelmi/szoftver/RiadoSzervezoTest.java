/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nagyi.vedelmi.szoftver;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

/**
 *
 * @author Pesta
 */
public class RiadoSzervezoTest {
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of riado method, of class RiadoSzervezo.
     */
    @Test
    public void testRiado() {
        KonzolLogolo logolas = mock(KonzolLogolo.class);
        Ertesito nagyiErtesito = mock(Ertesito.class);
        Ertesito vadaszErtesito = mock(Ertesito.class);
        NagyiErtesitoAblakUI nagyiErtesitoUI = mock(NagyiErtesitoAblakUI.class);
        RiadoSzervezo riadoSzervezo = new RiadoSzervezo(
                logolas,
                nagyiErtesito,
                vadaszErtesito,
                nagyiErtesitoUI);
                
        String farkasIranya = "Sopron felől";
        String nagyiUzenet = "nagyi üzenet";
        String vadaszUzenet = "vadász üzenet";
        doAnswer(
            new Answer() {
            public Object answer(InvocationOnMock invocation) {
            return nagyiUzenet;
        }})
        .when(nagyiErtesito).uzenetLetrehozas(farkasIranya);
        
        doAnswer(
            new Answer() {
            public Object answer(InvocationOnMock invocation) {
            return vadaszUzenet;
        }})
        .when(vadaszErtesito).uzenetLetrehozas(farkasIranya);
                
        riadoSzervezo.riado(farkasIranya);
        
        //verify
        
        verify(nagyiErtesito).uzenetLetrehozas(farkasIranya);  
        verify(vadaszErtesito).uzenetLetrehozas(farkasIranya);
        
        verify(logolas).logold(nagyiUzenet);
        verify(logolas).logold(vadaszUzenet);
        
        verify(nagyiErtesitoUI).setUzenet(nagyiUzenet);
        verify(nagyiErtesitoUI).setVisible(true);
        
        
    }
}

 