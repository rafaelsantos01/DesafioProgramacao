/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Questao02;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;



/**
 *
 * @author Rafael
 */
public class Questao02Test {
  
    /**
     * Test of verificar method, of class Questao02.
     */
    @Test
    public void testVerificar() {
       Questao02 q2 = new Questao02();
       
       int[] n = {1, 5, 3, 4, 2};
       int x=2;
       assertEquals(3, q2.verificar(n,x));
       
    }
    
}
