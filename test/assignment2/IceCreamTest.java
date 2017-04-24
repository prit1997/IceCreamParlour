/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author prit
 */
public class IceCreamTest {

    IceCream icecream;

    public IceCreamTest() {
        icecream = new IceCream("CHOCOLATE CHIP", 5, "Vanilla flavoured ice cream with semi-sweet chocolate chips");
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
     * Test of getName method, of class IceCream.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "CHOCOLATE CHIP";
        String result = icecream.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of getPrice method, of class IceCream.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        int expResult = 5;
        int result = icecream.getPrice();
        assertEquals(expResult, result);

    }

    /**
     * Test of getDescription method, of class IceCream.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        String expResult = "Vanilla flavoured ice cream with semi-sweet chocolate chips";
        String result = icecream.getDescription();
        assertEquals(expResult, result);

    }

}
