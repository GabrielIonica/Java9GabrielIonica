/*
 * Test ALU
 */
package oopcomputer;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Spunnky
 */
public class ALUTest {
    
    public ALUTest() {
    }

    /**
     * Test of getOperand method, of class ALU.
     */
    @Test
    public void testGetOperand() {
        System.out.println("getOperand");
        Alu instance = new Alu();
        Character expResult = null;
        Character result = instance.getOperand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOperand method, of class ALU.
     */
    @Test
    public void testSetOperand() {
        System.out.println("setOperand");
        Character operand = null;
        ALU instance = new ALU();
        instance.setOperand(operand);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOperandUnu method, of class ALU.
     */
    @Test
    public void testGetOperandUnu() {
        System.out.println("getOperandUnu");
        ALU instance = new ALU();
        Integer expResult = null;
        Integer result = instance.getOperandUnu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOperandUnu method, of class ALU.
     */
    @Test
    public void testSetOperandUnu() {
        System.out.println("setOperandUnu");
        Integer operandUnu = null;
        ALU instance = new ALU();
        instance.setOperandUnu(operandUnu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOperandDoi method, of class ALU.
     */
    @Test
    public void testGetOperandDoi() {
        System.out.println("getOperandDoi");
        ALU instance = new ALU();
        Integer expResult = null;
        Integer result = instance.getOperandDoi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOperandDoi method, of class ALU.
     */
    @Test
    public void testSetOperandDoi() {
        System.out.println("setOperandDoi");
        Integer operandDoi = null;
        ALU instance = new ALU();
        instance.setOperandDoi(operandDoi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRezultat method, of class ALU.
     */
    @Test
    public void testGetRezultat() {
        System.out.println("getRezultat");
        ALU instance = new ALU();
        Integer expResult = null;
        Integer result = instance.getRezultat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRezultat method, of class ALU.
     */
    @Test
    public void testSetRezultat() {
        System.out.println("setRezultat");
        Integer rezultat = null;
        ALU instance = new ALU();
        instance.setRezultat(rezultat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculeaza method, of class ALU.
     */
    @Test
    public void testCalculeaza() {
        System.out.println("calculeaza");
        ALU instance = new ALU();
        instance.calculeaza();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
