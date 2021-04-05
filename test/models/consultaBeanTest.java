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
public class consultaBeanTest {
    
    public consultaBeanTest() {
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
     * Test of getIdUsuario method, of class consultaBean.
     */
    @Test
    public void testGetIdUsuario() {
        System.out.println("getIdUsuario");
        consultaBean instance = new consultaBean();
        int expResult = instance.getIdUsuario();
        int result = instance.getIdUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIdUsuario method, of class consultaBean.
     */
    @Test
    public void testSetIdUsuario() {
        System.out.println("setIdUsuario");
        int IdUsuario = 0;
        consultaBean instance = new consultaBean();
        instance.setIdUsuario(IdUsuario);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombreDoctor method, of class consultaBean.
     */
    @Test
    public void testGetNombreDoctor() {
        System.out.println("getNombreDoctor");
        consultaBean instance = new consultaBean();
        String expResult = instance.getNombreDoctor();
        String result = instance.getNombreDoctor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNombreDoctor method, of class consultaBean.
     */
    @Test
    public void testSetNombreDoctor() {
        System.out.println("setNombreDoctor");
        String NombreDoctor = "";
        consultaBean instance = new consultaBean();
        instance.setNombreDoctor(NombreDoctor);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoExamen method, of class consultaBean.
     */
    @Test
    public void testGetTipoExamen() {
        System.out.println("getTipoExamen");
        consultaBean instance = new consultaBean();
        String expResult = instance.getTipoExamen();
        String result = instance.getTipoExamen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoExamen method, of class consultaBean.
     */
    @Test
    public void testSetTipoExamen() {
        System.out.println("setTipoExamen");
        String TipoExamen = "";
        consultaBean instance = new consultaBean();
        instance.setTipoExamen(TipoExamen);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getConsultorio method, of class consultaBean.
     */
    @Test
    public void testGetConsultorio() {
        System.out.println("getConsultorio");
        consultaBean instance = new consultaBean();
        String expResult =instance.getConsultorio();
        String result = instance.getConsultorio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setConsultorio method, of class consultaBean.
     */
    @Test
    public void testSetConsultorio() {
        System.out.println("setConsultorio");
        String Consultorio = "";
        consultaBean instance = new consultaBean();
        instance.setConsultorio(Consultorio);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
