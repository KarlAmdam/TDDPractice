package testdriven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExampleTests {

    @Test
    public void checkAValid10DigitISBNNumber() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("0140449116");
        assertTrue(result, "first value");
        result = validator.checkISBN("0425285960");
        assertTrue(result, "second value");
    }

    @Test
    public void checkAValid13DigitISBNNumber () {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("9781853260087");
        assertTrue(result, "first value");
        result = validator.checkISBN("9781853267338");
        assertTrue(result, "second value");
    }

    @Test
    public void ISBNNumbersEndingWithXAreValid () {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("012000030X");
        assertTrue(result);
    }

    @Test
    public void checkAnInvalid10DigitISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("0140449216");
        assertFalse(result);
    }

    @Test
    public void checkAnInvalid13DigitISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("9781853260067");
        assertFalse(result);
    }

    @Test
    public void nineDigitsISBNAreNotAllowed() {
        ValidateISBN validator = new ValidateISBN();
        assertThrows(NumberFormatException.class,
                () -> {validator.checkISBN("123456789");});
    }

    @Test
    public void check() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("0140449216");
        assertFalse(result);
    }

    @Test
    public void nonNumericISBNsAreNotAllowed() {
        ValidateISBN validator = new ValidateISBN();
        assertThrows(NumberFormatException.class,
                () -> {
                    validator.checkISBN("helloworld");
                });
    }
}