package com.jmariz.pantry.VOs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductIDTest {

    @Test
    void shouldReturnTrueWhenComparingProductIDtoItself() {
        // Arrange
        ProductID productID1 = new ProductID();
        ProductID productID2 = productID1;

        // Act
        boolean result = productID1.equals(productID2);

        // Assert
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenComparingProductIDtoNull() {
        // Arrange
        ProductID productID1 = new ProductID();
        ProductID productID2 = null;

        // Act
        boolean result = productID1.equals(productID2);

        // Assert
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenComparingProductIDtoDifferentClass() {
        // Arrange
        ProductID productID1 = new ProductID();
        Name name = new Name("Test Name");

        // Act
        boolean result = productID1.equals(name);

        // Assert
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenComparingProductIDtoDifferentProductID() {
        // Arrange
        ProductID productID1 = new ProductID();
        ProductID productID2 = new ProductID();

        // Act
        boolean result = productID1.equals(productID2);

        // Assert
        assertFalse(result);
    }

    @Test
    void shouldReturnUUIDStringWhenToStringIsCalled() {
        // Arrange
        ProductID productID = new ProductID();

        // Act
        String result = productID.toString();

        // Assert
        assertNotNull(result);
    }

    @Test
    void shouldReturnSameHashCodeForSameProductID() {
        // Arrange
        ProductID productID1 = new ProductID();
        ProductID productID2 = productID1;

        // Act
        int hash1 = productID1.hashCode();

        // Assert
        assertEquals(hash1, productID1.hashCode());
    }
}