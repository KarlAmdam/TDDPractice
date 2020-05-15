package testdriven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExampleTests {

    @Test
    public void checkAValidISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("0140449116");
        assertTrue(result, "first value");
        result = validator.checkISBN("0425285960");
        assertTrue(result, "second value");
    }

    @Test
    public void checkAnInvalidValidISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("0140449216");
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
}