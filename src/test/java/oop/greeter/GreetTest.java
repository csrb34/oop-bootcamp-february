package oop.greeter;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GreetTest {
    Greet greet = new Greet();

    @Test
    public void itShouldReturnYourName() {
        String name = "Jenny";
        var result = greet.sayHello(name);

        assertEquals(result, "Hello " + name);
    }

    @Test
    public void itShouldTrimYourName() {
        String name = "Jenny";
        var result = greet.trimName(name,0,2);

        assertEquals(result, "Je");
    }

    @Test
    public void itShouldReturnYourNameWithCapitalisedFirstLetter() {
        String name = "jenny";
        var result = greet.sayHello(name);

        assertEquals(result, "Hello Jenny");
    }

}