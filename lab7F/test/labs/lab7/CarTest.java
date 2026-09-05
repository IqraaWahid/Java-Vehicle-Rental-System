/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package labs.lab7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author i2wahid
 */
public class CarTest {
    
    public CarTest() {
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
     * Test of isAutomatic method, of class Car.
     */
    @Test
    public void testIsAutomatic() {
        System.out.println("isAutomatic");
        Car instance = new Car("ABC123", "Civic", 2020, true);
        boolean expResult = true;
        boolean result = instance.isAutomatic();
        assertEquals(expResult, result);

        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculateRentalPrice method, of class Car.
     */
    @Test
    public void testCalculateRentalPrice_int() {
        int days = 3;
        Car instance = new Car("XYZ999", "Corolla", 2019, false);
        double expResult = 55.0 * days;
        double result = instance.calculateRentalPrice(days);
        assertEquals(expResult, result, 0.0);

        //fail("The test case is a prototype.");
    }
    
}
