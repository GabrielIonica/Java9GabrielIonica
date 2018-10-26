/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopcomputer;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Spunnky
 */
public class ButonTest {
    
    public ButonTest() {
    }

    /**
     * Test of apasa method, of class Buton.
     */
    @Test
    public void testApasa() {
        System.out.println("apasa");
        Buton instance = null;
        Character expResult = null;
        Character result = instance.apasa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
