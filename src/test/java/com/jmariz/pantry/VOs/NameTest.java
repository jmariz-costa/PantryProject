package com.jmariz.pantry.VOs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameTest {

    @Test
    void shouldThrowIllegalArgumentExceptionWhenNameIsNull() {
        // Arrange
        String name = null;

        // Act
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {new Name(null);});

        // Assert
        assertEquals("Name must not be null or blank", exception.getMessage());
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenNameIsBlank() {
        // Arrange
        String name = "   ";

        // Act
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Name(name);
        });

        // Assert
        assertEquals("Name must not be null or blank", exception.getMessage());
    }

    @Test
    void shouldReturnTrueWhenComparingNametoItself() {
        // Arrange
        Name name1 = new Name("Test Name");
        Name name2 = name1;

        // Act
        boolean result = name1.equals(name2);

        // Assert
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenComparingNametoNull() {
        // Arrange
        Name name = new Name("Test Name");
        Name nullName = null;

        // Act
        boolean result = name.equals(nullName);

        // Assert
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenComparingNameToDifferentClass() {
        // Arrange
        ProductID productID1 = new ProductID();
        Name name = new Name("Test Name");

        // Act
        boolean result = name.equals(productID1);

        // Assert
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenComparingNameToADifferentName() {
        // Arrange
        Name name1 = new Name("Test Name");
        Name name2 = new Name("Fail Name");

        // Act
        boolean result = name1.equals(name2);

        // Assert
        assertFalse(result);
    }

    @Test
    void shouldReturnName() {
        // Arrange
        Name name = new Name("Test Name");

        // Act
        String result = name.toString();

        // Assert
        assertEquals("Test Name", result);
    }

    @Test
    void shouldReturnSameHashCode() {
        // Arrange
        Name name1 = new Name("Test1");
        Name name2 = new Name("Test2");

        // Act
        int result = name1.hashCode();

        // Assert
        assertEquals(name1.hashCode(), result);
    }
}