package com.jmariz.pantry.domain.valueObjects;

import com.jmariz.pantry.ddd.DomainId;

import java.util.UUID;

public class ProductID implements DomainId {

    private final UUID productID;

    public ProductID() {
        productID = UUID.randomUUID();
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (!(other instanceof ProductID))
            return false;
        ProductID toTest = (ProductID) other;
        return toTest.productID.equals(this.productID);
    }

    @Override
    public String toString() {
        return productID.toString();
    }

    @Override
    public int hashCode() {
        return productID.hashCode();
    }

    public UUID getProductID () {
        return productID;
    }
}
