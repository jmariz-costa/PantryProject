package com.jmariz.pantry.domain.valueObjects;

import com.jmariz.pantry.ddd.ValueObject;

public class Quantity implements ValueObject {

    private int quantity;

    public Quantity(int quantity) {
        if (quantity < 1) {
            throw new IllegalArgumentException("Quantity must be higher than 0.");
        }
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Quantity)) return false;
        Quantity quantity1 = (Quantity) o;
        return quantity == quantity1.quantity;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(quantity);
    }

    public int getQuantity() {
        return quantity;
    }
}
