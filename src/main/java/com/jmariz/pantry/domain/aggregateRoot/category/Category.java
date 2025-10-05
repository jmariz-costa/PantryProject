package com.jmariz.pantry.domain.aggregateRoot.category;

import com.jmariz.pantry.domain.valueObjects.CategoryID;
import com.jmariz.pantry.domain.valueObjects.Name;
import com.jmariz.pantry.ddd.AggregateRoot;

public class Category implements AggregateRoot<CategoryID> {

    private final CategoryID categoryID;

    private final Name name;

    public Category(CategoryID categoryID, Name name) {
        this.categoryID = categoryID;
        this.name = name;
    }


    @Override
    public CategoryID identity() {
        return categoryID;
    }

    @Override
    public boolean sameAs(Object object) {

        if (object instanceof Category)
            return name.equals(((Category) object).name);
        return false;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;

        if (object instanceof Category that) {
            return this.categoryID.equals(that.categoryID);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return categoryID.hashCode();
    }

    @Override
    public String toString() {
        return name.toString();
    }
}
