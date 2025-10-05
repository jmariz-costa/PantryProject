package com.jmariz.pantry.domain;

import com.jmariz.pantry.VOs.CategoryID;
import com.jmariz.pantry.VOs.Name;
import com.jmariz.pantry.VOs.ProductID;
import com.jmariz.pantry.ddd.AggregateRoot;

public class Product implements AggregateRoot<ProductID> {

    private final ProductID productID;
    private final CategoryID categoryID;
    private final Name name;

    public Product(ProductID productID, CategoryID categoryID, Name name) {
        this.productID = productID;
        this.categoryID = categoryID;
        this.name = name;
    }

    @Override
    public ProductID identity() {
        return productID;
    }

    @Override
    public boolean sameAs(Object object) {
        if (object instanceof Product)
            return this.name.equals(((Product) object).name);
        return false;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object instanceof Product that)
            return this.productID.equals(that.productID);
        return false;
    }

    @Override
    public int hashCode() {
        return productID.hashCode();
    }

    @Override
    public String toString() {
        return name.toString();
    }
}
