/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luisa Manrique
 */
public class CitaBeanTest {
    
    public CitaBeanTest() {
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
     * Test of getNombre method, of class CitaBean.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        CitaBean instance = new CitaBean();
        String expResult = instance.getNombre();
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class CitaBean.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String Nombre = "";
        CitaBean instance = new CitaBean();
        instance.setNombre(Nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIdent method, of class CitaBean.
     */
    @Test
    public void testGetIdent() {
        System.out.println("getIdent");
        CitaBean instance = new CitaBean();
        String expResult = instance.getIdent();
        String result = instance.getIdent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIdent method, of class CitaBean.
     */
    @Test
    public void testSetIdent() {
        System.out.println("setIdent");
        String Ident = "";
        CitaBean instance = new CitaBean();
        instance.setIdent(Ident);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class CitaBean.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        CitaBean instance = new CitaBean();
        String expResult = instance.getFecha();
        String result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class CitaBean.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        String Fecha = "";
        CitaBean instance = new CitaBean();
        instance.setFecha(Fecha);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo method, of class CitaBean.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        CitaBean instance = new CitaBean();
        String expResult = instance.getTipo();
        String result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class CitaBean.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String Tipo = "";
        CitaBean instance = new CitaBean();
        instance.setTipo(Tipo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
