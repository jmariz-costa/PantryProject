package com.jmariz.pantry.domain.valueObjects;

import com.jmariz.pantry.ddd.DomainId;
import com.jmariz.pantry.ddd.ValueObject;

import java.util.UUID;

public class CategoryID implements ValueObject, DomainId {

    private final UUID categoryID;

    public CategoryID() {
        categoryID = UUID.randomUUID();
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (!(other instanceof CategoryID))
            return false;
        CategoryID toTest = (CategoryID) other;
        return toTest.categoryID.equals(this.categoryID);
    }

    @Override
    public String toString() {
        return categoryID.toString();
    }

    @Override
    public int hashCode() {
        return categoryID.hashCode();
    }

    public UUID getCategoryID () {
        return categoryID;
    }
}
