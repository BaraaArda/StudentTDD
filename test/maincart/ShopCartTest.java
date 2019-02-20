/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maincart;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Baraa Arda
 */
public class ShopCartTest {
    
    public ShopCartTest() {
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
     * Test of addbook method, of class ShopCart.
     */
    @Test
    public void testAddbook() {
        System.out.println("addbook");
        String name = "";
        int price = 0;
        int unit = 0;
        ShopCart instance = new ShopCart();
        instance.addbook(name, price, unit);
        // TODO review the generated test code and remove the default call to fail.
       
    }
     @Test
    public void testAddbook2() {
        System.out.println("addbook");
        int excount=1;
        int extotval=127;
        ShopCart instance = new ShopCart();
        instance.addbook("JavaBook", 127, 1);
        assertEquals(excount,instance.count);
        assertEquals(extotval,instance.totVal);
        
        
        // TODO review the generated test code and remove the default call to fail.
       
    }
     @Test
    public void testAddbook3() {
        System.out.println("addbook");
        int excount=2;
        int extotval=227;
        ShopCart instance = new ShopCart();
        instance.addbook("JavaBook", 127, 1);
         instance.addbook("Web Design Book", 100, 1);
        assertEquals(excount,instance.count);
        assertEquals(extotval,instance.totVal);
        
        
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
