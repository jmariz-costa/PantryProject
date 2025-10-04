package com.jmariz.pantry.VOs;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ExpirationDateTest {

    @Test
    void shouldReturnTrueWhenComparingExpirationDateToItself() {
        // Arrange
        ExpirationDate expirationDate1 = new ExpirationDate(LocalDate.now());

        // Act
        boolean result = expirationDate1.equals(expirationDate1);

        // Assert
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenComparingExpirationDateToNull() {
        // Arrange
        ExpirationDate expirationDate1 = new ExpirationDate(LocalDate.now());
        ExpirationDate expirationDate2 = null;

        // Act
        boolean result = expirationDate1.equals(expirationDate2);

        // Assert
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenComparingExpirationDateToDifferentClass() {
        // Arrange
        ExpirationDate expirationDate1 = new ExpirationDate(LocalDate.now());
        Name name = new Name("Test Name");

        // Act
        boolean result = expirationDate1.equals(name);

        // Assert
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenComparingExpirationDateToADifferentExpirationDate() {
        // Arrange
        ExpirationDate expirationDate1 = new ExpirationDate(LocalDate.now());
        ExpirationDate expirationDate2 = new ExpirationDate(LocalDate.of(1970, 1, 1));

        // Act
        boolean result = expirationDate1.equals(expirationDate2);

        // Assert
        assertFalse(result);
    }

    @Test
    void shouldReturnTrueWhenComparingExpirationDateToASameExpirationDate() {
        // Arrange
        ExpirationDate expirationDate1 = new ExpirationDate(LocalDate.of(1970, 1, 1));
        ExpirationDate expirationDate2 = new ExpirationDate(LocalDate.of(1970, 1, 1));

        // Act
        boolean result = expirationDate1.equals(expirationDate2);

        // Assert
        assertTrue(result);
    }

    @Test
    void shouldReturnSameHashCode() {
        // Arrange
        ExpirationDate expirationDate1 = new ExpirationDate(LocalDate.of(1970, 1, 1));
        ExpirationDate expirationDate2 = new ExpirationDate(LocalDate.of(1970, 1, 1));

        // Act
        int result = expirationDate2.hashCode();

        // Assert
        assertEquals(expirationDate1.hashCode(), result);
    }

    @Test
    void shouldReturnDifferentHashCode() {
        // Arrange
        ExpirationDate expirationDate1 = new ExpirationDate(LocalDate.of(1970, 1, 1));
        ExpirationDate expirationDate2 = new ExpirationDate(LocalDate.of(1971, 1, 1));

        // Act
        int result = expirationDate2.hashCode();

        // Assert
        assertNotEquals(expirationDate1.hashCode(), result);
    }

    @Test
    void shouldReturnExpirationDate() {
        // Arrange
        LocalDate now = LocalDate.now();
        ExpirationDate expirationDate = new ExpirationDate(now);

        // Act
        LocalDate result = expirationDate.getExpirationDate();

        // Assert
        assertEquals(now, result);
    }

    @Test
    void shouldGetExpirationDateAsString () {

        // Arrange
        ExpirationDate expirationDate = new ExpirationDate(LocalDate.of(1970, 1, 1));

        // Act
        String result = expirationDate.toString();

        // Assert
        assertEquals("1970-01-01", result);
    }

    @Test
    void shouldReturnEmptyStringIfExpirationDateIsNull(){
        ExpirationDate date = new ExpirationDate(null);

        String result = date.toString();

        assertEquals("", result);
    }
}