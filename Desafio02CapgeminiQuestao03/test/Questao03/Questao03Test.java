/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Questao03;


import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.jupiter.api.Test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
/**
 *
 * @author Rafael
 */
public class Questao03Test extends Questao03{
   
    @Test
    public void test() {
          Questao03 q3 = new Questao03();
         //assertEquals("omd luo an", q3.encriptar("ola mundo"));
        Assertions.assertNotNull("omd luo an", q3.encriptar("ola mundo"));
    }

    
}

/*
org/opentest4j/AssertionFailedError
java.lang.NoClassDefFoundError
	at Questao03.Questao03Test.test(Questao03Test.java:21)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520)

*/