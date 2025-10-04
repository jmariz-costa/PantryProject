package com.jmariz.pantry.VOs;

import com.jmariz.pantry.ddd.ValueObject;

public class Name implements ValueObject {

    private final String name;

    public Name(String name) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Name must not be null or blank");
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Name))
            return false;
        Name toTest = (Name) o;
        return toTest.name.equals(this.name);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

