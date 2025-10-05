package com.jmariz.pantry.domain;

import com.jmariz.pantry.VOs.ProductID;
import com.jmariz.pantry.ddd.AggregateRoot;

public class Product implements AggregateRoot<ProductID> {

    private ProductID productID;

    public Product(ProductID productID) {}

    @Override
    public ProductID identity() {
        return null;
    }

    @Override
    public boolean sameAs(Object object) {
        return false;
    }
}
