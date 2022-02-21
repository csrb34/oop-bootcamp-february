package oop;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HelloWorldTest {

    @Test
    public void itShouldReturnHelloWorld() {
        assertEquals(HelloWorld.salute(), "hello world!");
    }
    
    @Test
    public void itShould() {

    }
}