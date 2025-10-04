package com.jmariz.pantry.VOs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {

    @Test
    void shouldThrowIllegalArgumentIfQuantityIsLessThan1 () {
        // Arrange
        int value = 0;

        // Act
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Quantity(value);
        });

        // Assert
        assertEquals("Quantity must be higher than 0.", exception.getMessage());
    }

    @Test
    void shouldReturnTrueWhenComparingQuantityToItself() {
        // Arrange
        Quantity qt1 = new Quantity(1);
        Quantity qt2 = qt1;

        // Act
        boolean result = qt1.equals(qt2);

        // Assert
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenComparingQuantityToNull() {
        // Arrange
        Quantity qt1 = new Quantity(1);
        Quantity nullQt = null;

        // Act
        boolean result = qt1.equals(nullQt);

        // Assert
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenComparingQuantityToDifferentClass() {
        // Arrange
        Quantity qt1 = new Quantity(1);
        Name name = new Name("Test Name");

        // Act
        boolean result = name.equals(qt1);

        // Assert
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenComparingQuantityToADifferentQuantityWithADifferentValue() {
        // Arrange
        Quantity qt1 = new Quantity (1);
        Quantity qt2 = new Quantity(2);

        // Act
        boolean result = qt1.equals(qt2);

        // Assert
        assertFalse(result);
    }

    @Test
    void shouldReturnTrueWhenComparingQuantityToADifferentQuantityWithSameValue() {
        // Arrange
        Quantity qt1 = new Quantity (2);
        Quantity qt2 = new Quantity(2);

        // Act
        boolean result = qt1.equals(qt2);

        // Assert
        assertTrue(result);
    }
}