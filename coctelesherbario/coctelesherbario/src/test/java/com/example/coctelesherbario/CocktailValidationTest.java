package com.example.coctelesherbario.validation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CocktailValidationTest {

    @Test
    void testIdValidation() {
        assertDoesNotThrow(() -> CocktailValidation.idValidation(1));

        Exception exception = assertThrows(Exception.class, () -> CocktailValidation.idValidation(0));
        assertEquals("The id cannot be less than 0", exception.getMessage());
    }

    @Test
    void testPriceValidation() {
        assertDoesNotThrow(() -> CocktailValidation.priceValidation(10.5f));

        Exception exception = assertThrows(Exception.class, () -> CocktailValidation.priceValidation(-1.0f));
        assertEquals("The price cannot be less than 0", exception.getMessage());
    }

    @Test
    void testNameValidation() {
        assertDoesNotThrow(() -> CocktailValidation.nameValidation("Cocktail"));

        Exception exception = assertThrows(Exception.class, () -> CocktailValidation.nameValidation("Cocktail123"));
        assertEquals("The name can only contain letters", exception.getMessage());

        exception = assertThrows(Exception.class, () -> CocktailValidation.nameValidation("Cocktail!@#"));
        assertEquals("The name can only contain letters", exception.getMessage());
    }

    @Test
    void testDueDateValidation() {
        assertDoesNotThrow(() -> CocktailValidation.dueDateValidation((byte) 1));

        Exception exception = assertThrows(Exception.class, () -> CocktailValidation.dueDateValidation((byte) 0));
        assertEquals("The due date must be greater than 0", exception.getMessage());

    }
}