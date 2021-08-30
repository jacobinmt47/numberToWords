/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sol;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jacob
 */
public class Sol1Test {
    
    public Sol1Test() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    

    /**
     * Test of intToWord method, of class Sol1.
     */
    @org.junit.jupiter.api.Test
    public void testIntToWord() {
        System.out.println("intToWord");
        int n = 1000;
        Sol1 instance = new Sol1();
        String expResult = "One Thousand";
        String result = instance.numberToWords(n);
        assertEquals(expResult, result);
        
    }
    @org.junit.jupiter.api.Test
    public void testThousands(){
        int n1 = 1000000;
        int n2 = 12345;
        int n3 = 21000;
        Sol1 instance = new Sol1();
        assertEquals("One Million",instance.numberToWords(n1));
        assertEquals("Twelve Thousand Three Hundred Forty Five",instance.numberToWords(n2));
        assertEquals("Twenty One Thousand",instance.numberToWords(n3));
    }

    @org.junit.jupiter.api.Test
    public void testBillion(){
        Sol1 s = new Sol1();
        assertEquals("One Billion",s.numberToWords(1000000000));
    }
}
