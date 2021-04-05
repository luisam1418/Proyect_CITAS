/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import java.util.List;
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
public class ConsultaDAOTest {
    
    public ConsultaDAOTest() {
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
     * Test of consultar method, of class ConsultaDAO.
     */
    @Test
    public void testConsultar() {
        System.out.println("consultar");
        ConsultaDAO instance = new ConsultaDAO();
        List expResult = instance.consultar();
        List result = instance.consultar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class ConsultaDAO.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        String NombreDoctor = "";
        String TipoExamen = "";
        String Consultorio = "";
        ConsultaDAO instance = new ConsultaDAO();
        instance.insert(NombreDoctor, TipoExamen, Consultorio);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class ConsultaDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        String NombreDoctor = "";
        String TipoExamen = "";
        String Consultorio = "";
        int IdUsuario = 0;
        ConsultaDAO instance = new ConsultaDAO();
        instance.update(NombreDoctor, TipoExamen, Consultorio, IdUsuario);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class ConsultaDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int IdUsuario = 0;
        ConsultaDAO instance = new ConsultaDAO();
        instance.delete(IdUsuario);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
