package com.jmariz.pantry.domain;

import com.jmariz.pantry.VOs.CategoryID;
import com.jmariz.pantry.VOs.Name;
import com.jmariz.pantry.VOs.ProductID;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void shouldReturnProductID () {
        // Arrange
        ProductID productID = new ProductID();
        CategoryID categoryID = new CategoryID();
        Name name = new Name("Test");
        Product product = new Product(productID, categoryID, name);

        // Act
        ProductID result = product.identity();

        // Assert
        assertEquals(productID, result);
    }

    @Test
    void shouldReturnTrueWhenComparingProductToItself() {
        // Arrange
        ProductID productID = new ProductID();
        CategoryID categoryID = new CategoryID();
        Name name = new Name("Test");
        Product product = new Product(productID, categoryID, name);

        // Act
        boolean result = product.equals(product);

        // Assert
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenComparingProductToNull() {
        // Arrange
        ProductID productID = new ProductID();
        CategoryID categoryID = new CategoryID();
        Name name = new Name("Test");
        Product product = new Product(productID, categoryID, name);

        // Act
        boolean result = product.equals(null);

        // Assert
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenComparingProductToDifferentClass() {
        // Arrange
        ProductID productID = new ProductID();
        CategoryID categoryID = new CategoryID();
        Name name = new Name("Test");
        Product product = new Product(productID, categoryID, name);

        // Act
        boolean result = product.equals(name);

        // Assert
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenComparingProductToADifferentProduct() {
        // Arrange
        ProductID productID1 = new ProductID();
        ProductID productID2 = new ProductID();
        CategoryID categoryID = new CategoryID();
        Name name1 = new Name("Test");
        Product product1 = new Product(productID1, categoryID, name1);
        Product product2 = new Product(productID2, categoryID, name1);

        // Act
        boolean result = product1.equals(product2);

        // Assert
        assertFalse(result);
    }

    @Test
    void shouldReturnTrueWhenComparingProductsWithTheSameID() {
        // Arrange
        ProductID productID1 = new ProductID();
        CategoryID categoryID = new CategoryID();
        Name name1 = new Name("Test");
        Name name2 = new Name("Test2");
        Product product1 = new Product(productID1, categoryID, name1);
        Product product2 = new Product(productID1, categoryID, name2);

        // Act
        boolean result = product1.equals(product2);

        // Assert
        assertTrue(result);
    }

    @Test
    void shouldReturnSameHashCode() {
        // Arrange
        ProductID productID1 = new ProductID();
        CategoryID categoryID = new CategoryID();
        Name name1 = new Name("Test");
        Product product1 = new Product(productID1, categoryID, name1);
        Product product2 = new Product(productID1, categoryID, name1);

        // Act
        int result = product2.hashCode();

        // Assert
        assertEquals(product1.hashCode(), result);
    }

    @Test
    void shouldReturnDifferentHashCode() {
        // Arrange
        ProductID productID1 = new ProductID();
        ProductID productID2 = new ProductID();
        CategoryID categoryID = new CategoryID();
        Name name1 = new Name("Test");
        Product product1 = new Product(productID1, categoryID, name1);
        Product product2 = new Product(productID2, categoryID, name1);

        // Act
        int result = product1.hashCode();

        // Assert
        assertNotEquals(product2.hashCode(), result);
    }

    @Test
    void shouldGetCategoryAsString () {
        // Arrange
        ProductID productID1 = new ProductID();
        CategoryID categoryID = new CategoryID();
        Name name1 = new Name("Test");
        Product product1 = new Product(productID1, categoryID, name1);

        // Act
        String result = product1.toString();

        // Assert
        assertEquals("Test", result);
    }

    @Test
    void shouldReturnTrueWhenTwoCategoriesHaveTheSameName(){
        // Arrange
        ProductID productID1 = new ProductID();
        CategoryID categoryID = new CategoryID();
        Name name1 = new Name("Test");
        Name name2 = new Name("Test");
        Product product1 = new Product(productID1, categoryID, name1);
        Product product2 = new Product(productID1, categoryID, name2);

        // Act
        boolean result = product1.sameAs(product2);

        // Assert
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenTwoCategoriesHaveDifferentName(){
        // Arrange
        ProductID productID1 = new ProductID();
        CategoryID categoryID = new CategoryID();
        Name name1 = new Name("Test");
        Name name2 = new Name("Test2");
        Product product1 = new Product(productID1, categoryID, name1);
        Product product2 = new Product(productID1, categoryID, name2);

        // Act
        boolean result = product1.sameAs(product2);

        // Assert
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenCategoryIsNotTheSameTypeAsTheOtherClass(){
        // Arrange
        ProductID productID1 = new ProductID();
        CategoryID categoryID = new CategoryID();
        Name name1 = new Name("Test");
        Product product1 = new Product(productID1, categoryID, name1);

        // Act
        boolean result = product1.sameAs(name1);

        // Assert
        assertFalse(result);
    }
}