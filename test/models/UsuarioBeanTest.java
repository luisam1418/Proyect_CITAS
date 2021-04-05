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
public class UsuarioBeanTest {
    
    public UsuarioBeanTest() {
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
     * Test of getNombre method, of class UsuarioBean.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        UsuarioBean instance = new UsuarioBean();
        String expResult = instance.getNombre();
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class UsuarioBean.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String Nombre = "";
        UsuarioBean instance = new UsuarioBean();
        instance.setNombre(Nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCorreo method, of class UsuarioBean.
     */
    @Test
    public void testGetCorreo() {
        System.out.println("getCorreo");
        UsuarioBean instance = new UsuarioBean();
        String expResult = instance.getCorreo();
        String result = instance.getCorreo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCorreo method, of class UsuarioBean.
     */
    @Test
    public void testSetCorreo() {
        System.out.println("setCorreo");
        String Correo = "";
        UsuarioBean instance = new UsuarioBean();
        instance.setCorreo(Correo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEdad method, of class UsuarioBean.
     */
    @Test
    public void testGetEdad() {
        System.out.println("getEdad");
        UsuarioBean instance = new UsuarioBean();
        String expResult = instance.getEdad();
        String result = instance.getEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEdad method, of class UsuarioBean.
     */
    @Test
    public void testSetEdad() {
        System.out.println("setEdad");
        String Edad = "";
        UsuarioBean instance = new UsuarioBean();
        instance.setEdad(Edad);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
