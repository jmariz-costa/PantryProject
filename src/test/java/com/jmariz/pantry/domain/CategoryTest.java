package com.jmariz.pantry.domain;

import com.jmariz.pantry.VOs.CategoryID;
import com.jmariz.pantry.VOs.Name;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    @Test
    void shouldReturnCategoryID () {
        // Arrange
        CategoryID categoryID = new CategoryID();
        Name name = new Name("Test");
        Category category = new Category(categoryID, name);

        // Act
        CategoryID result = category.identity();

        // Assert
        assertEquals(categoryID, result);
    }

    @Test
    void shouldReturnTrueWhenComparingCategoryToItself() {
        // Arrange
        CategoryID categoryID = new CategoryID();
        Name name = new Name("Test");
        Category category = new Category(categoryID, name);

        // Act
        boolean result = category.equals(category);

        // Assert
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenComparingCategoryToNull() {
        // Arrange
        CategoryID categoryID = new CategoryID();
        Name name = new Name("Test");
        Category category = new Category(categoryID, name);
        Category categoryNull = null;

        // Act
        boolean result = category.equals(categoryNull);

        // Assert
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenComparingCategoryToDifferentClass() {
        // Arrange
        CategoryID categoryID = new CategoryID();
        Name name = new Name("Test");
        Category category = new Category(categoryID, name);

        // Act
        boolean result = category.equals(name);

        // Assert
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenComparingCategoryToADifferentCategory() {
        // Arrange
        CategoryID categoryID1 = new CategoryID();
        CategoryID categoryID2 = new CategoryID();
        Name name = new Name("Test");
        Category category1 = new Category(categoryID1, name);
        Category category2 = new Category(categoryID2, name);

        // Act
        boolean result = category1.equals(category2);

        // Assert
        assertFalse(result);
    }

    @Test
    void shouldReturnTrueWhenComparingCategoriesWithTheSameID() {
        // Arrange
        CategoryID categoryID1 = new CategoryID();
        Name name1 = new Name("Test1");
        Name name2 = new Name("Test2");
        Category category1 = new Category(categoryID1, name1);
        Category category2 = new Category(categoryID1, name2);

        // Act
        boolean result = category1.equals(category2);

        // Assert
        assertTrue(result);
    }

    @Test
    void shouldReturnSameHashCode() {
        // Arrange
        CategoryID categoryID = new CategoryID();
        Name name = new Name("Test");
        Category category1 = new Category(categoryID, name);
        Category category2 = new Category(categoryID, name);

        // Act
        int result = category2.hashCode();

        // Assert
        assertEquals(category1.hashCode(), result);
    }

    @Test
    void shouldReturnDifferentHashCode() {
        // Arrange
        CategoryID categoryID1 = new CategoryID();
        CategoryID categoryID2 = new CategoryID();
        Name name = new Name("Test");
        Category category1 = new Category(categoryID1, name);
        Category category2 = new Category(categoryID2, name);

        // Act
        int result = category2.hashCode();

        // Assert
        assertNotEquals(category1.hashCode(), result);
    }

    @Test
    void shouldGetCategoryAsString () {
        // Arrange
        CategoryID categoryID1 = new CategoryID();
        Name name = new Name("Test");
        Category category = new Category(categoryID1, name);

        // Act
        String result = category.toString();

        // Assert
        assertEquals("Test", result);
    }

    @Test
    void shouldReturnTrueWhenTwoCategoriesHaveTheSameName(){
        // Arrange
        CategoryID categoryID1 = new CategoryID();
        Name name1 = new Name("Test");
        Category category1 = new Category(categoryID1, name1);
        Category category2 = new Category(categoryID1, name1);

        // Act
        boolean result = category1.sameAs(category2);

        // Assert
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenTwoCategoriesHaveDifferentName(){
        // Arrange
        CategoryID categoryID1 = new CategoryID();
        Name name1 = new Name("Test");
        Name name2 = new Name("Test2");
        Category category1 = new Category(categoryID1, name1);
        Category category2 = new Category(categoryID1, name2);

        // Act
        boolean result = category1.sameAs(category2);

        // Assert
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenCategoryIsNotTheSameTypeAsTheOtherClass(){
        // Arrange
        CategoryID categoryID1 = new CategoryID();
        Name name1 = new Name("Test");
        Category category1 = new Category(categoryID1, name1);

        // Act
        boolean result = category1.sameAs(name1);

        // Assert
        assertFalse(result);
    }
}