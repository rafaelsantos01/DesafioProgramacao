/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Questao01;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Rafael
 */
public class Questao01Test {
    
    public Questao01Test() {
    }
   

    /**
     * Test of mediana method, of class Questao01.
     */
    @Test
    public void testMediana() {
       Questao01 q1 = new Questao01();
       int[] arr = {9,2,1,4,6};
       assertEquals(4, q1.mediana(arr));
    }
    
     @Test
    public void testMediana2() {
       Questao01 q1 = new Questao01();
        int[] arr = {15,20,10,5,2};
       assertEquals(10, q1.mediana(arr));
    }
    
    
       
       
    }


    

