package oop.greeter;

import org.testng.annotations.Test;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

import static org.testng.Assert.assertEquals;

public class GreetTest {

    String morningInstant = "2021-02-25T10:00:00Z";
    String afternoonInstant = "2021-02-25T14:00:00Z";
    String eveningInstant = "2021-02-25T20:00:00Z";
    String nightInstant = "2021-02-26T01:00:00Z";


    @Test
    public void itShouldReturnYourName() {
        Greet greet = new Greet(Clock.fixed(Instant.parse(afternoonInstant), ZoneId.of("UTC")));
        String name = "Jenny";
        var result = greet.greet(name);

        assertEquals(result, "Hello Jenny");
    }

    @Test
    public void itShouldTrimYourName() {
        Greet greet = new Greet(Clock.fixed(Instant.parse(afternoonInstant), ZoneId.of("UTC")));
        String name = "Jenny ";
        var result = greet.greet(name);

        assertEquals(result, "Hello Jenny");
    }


    @Test
    public void itShouldReturnYourNameWithCapitalisedFirstLetter() {
        Greet greet = new Greet(Clock.fixed(Instant.parse(afternoonInstant), ZoneId.of("UTC")));
        String name = "jenny";
        var result = greet.greet(name);

        assertEquals(result, "Hello Jenny");
    }

    @Test
    public void itShouldReturnGoodMorningAt10AM() {
        Greet greet = new Greet(Clock.fixed(Instant.parse(morningInstant), ZoneId.of("UTC")));
        String name = "jenny";

        var result = greet.greet(name);

        assertEquals(result, "Good morning Jenny");
    }

    @Test
    public void itShouldReturnGoodEveningAt20PM() {
        Greet greet = new Greet(Clock.fixed(Instant.parse(eveningInstant), ZoneId.of("UTC")));
        String name = "jenny";

        var result = greet.greet(name);

        assertEquals(result, "Good evening Jenny");
    }

    @Test
    public void itShouldReturnGoodNightAt01AM() {
        Greet greet = new Greet(Clock.fixed(Instant.parse(nightInstant), ZoneId.of("UTC")));
        String name = "jenny";

        var result = greet.greet(name);

        assertEquals(result, "Good night Jenny");
    }


}