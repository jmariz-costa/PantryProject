package com.jmariz.pantry.VOs;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class CategoryIDTest {

    @Test
    void shouldReturnTrueWhenComparingCategoryIDtoItself() {
        // Arrange
        CategoryID categoryID1 = new CategoryID();

        // Act
        boolean result = categoryID1.equals(categoryID1);

        // Assert
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenComparingCategoryIDtoNull() {
        // Arrange
        CategoryID categoryID1 = new CategoryID();
        CategoryID categoryID2 = null;

        // Act
        boolean result = categoryID1.equals(categoryID2);

        // Assert
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenComparingCategoryIDtoDifferentClass() {
        // Arrange
        CategoryID categoryID1 = new CategoryID();
        ProductID productID1 = new ProductID();

        // Act
        boolean result = categoryID1.equals(productID1);

        // Assert
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenComparingCategoryIDtoDifferentCategoryID() {
        // Arrange
        CategoryID categoryID1 = new CategoryID();
        CategoryID categoryID2 = new CategoryID();

        // Act
        boolean result = categoryID1.equals(categoryID2);

        // Assert
        assertFalse(result);
    }

    @Test
    void shouldReturnUUIDStringWhenToStringIsCalled() {
        // Arrange
        CategoryID categoryID1 = new CategoryID();

        // Act
        String result = categoryID1.toString();

        // Assert
        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertFalse(result.isBlank());
    }

    @Test
    void shouldReturnSameHashCodeForSameCategoryID() {
        // Arrange
        CategoryID categoryID1 = new CategoryID();
        CategoryID categoryID2 = categoryID1;

        // Act
        int hash1 = categoryID1.hashCode();

        // Assert
        assertEquals(hash1, categoryID2.hashCode());
    }

    @Test
    void shouldReturnDifferentHashCodeForDifferentCategoryID() {
        // Arrange
        CategoryID categoryID1 = new CategoryID();
        CategoryID categoryID2 = new CategoryID();

        // Act
        int hash1 = categoryID1.hashCode();

        // Assert
        assertNotEquals(hash1, categoryID2.hashCode());
    }

    @Test
    void shouldReturnCategoryIDAsUUID () {
        // Arrange
        CategoryID categoryID1 = new CategoryID();

        // Act
        UUID result = categoryID1.getCategoryID();

        // Assert
        assertNotNull(result);
    }
}