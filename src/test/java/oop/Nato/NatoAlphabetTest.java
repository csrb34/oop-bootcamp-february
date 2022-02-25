package oop.Nato;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NatoAlphabetTest {

    @Test
    public void itShouldEncodeHello() {
        assertEquals(NatoAlphabet.encode("hello"), "hotel-echo-lima-lima-oscar");
    }

    @Test
    public void itShouldDecodeNatoWord() {
        assertEquals(NatoAlphabet.decode("hotel-echo-lima-lima-oscar"), "hello");
    }

    @Test
    public void itShouldEncodeWithSpacesAsTheWordNull() {
        assertEquals(NatoAlphabet.encode("khabib nurmagomedov"), "kilo-hotel-alpha-bravo-india-bravo-null-november-uniform-romeo-mike-alpha-golf-oscar-mike-echo-delta-oscar-victor");
    }

    @Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "input outside NATO alphabet")
    public void itShouldThrowAnExceptionWhenInvalidString() {
        NatoAlphabet.encode("");

    }

    @Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "input outside NATO alphabet")
    public void itShouldThrowAnExceptionWhenInvalidStringEncode() {
        NatoAlphabet.decode("");

    }

}