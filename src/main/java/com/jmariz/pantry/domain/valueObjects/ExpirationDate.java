package com.jmariz.pantry.domain.valueObjects;

import com.jmariz.pantry.ddd.ValueObject;

import java.time.LocalDate;

public class ExpirationDate implements ValueObject {

    private LocalDate expirationDate;

    public  ExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExpirationDate that = (ExpirationDate) o;
        return expirationDate.equals(that.expirationDate);
    }

    @Override
    public int hashCode() {
        return expirationDate.hashCode();
    }

    @Override
    public String toString() {
        if (expirationDate == null)
            return "";
        return expirationDate.toString();
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }
}
