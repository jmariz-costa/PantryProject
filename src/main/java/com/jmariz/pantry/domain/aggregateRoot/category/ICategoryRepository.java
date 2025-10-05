package com.jmariz.pantry.domain.aggregateRoot.category;

import com.jmariz.pantry.ddd.IRepository;
import com.jmariz.pantry.domain.valueObjects.CategoryID;
import com.jmariz.pantry.domain.valueObjects.Name;

public interface ICategoryRepository extends IRepository<CategoryID, Category> {
    boolean existsCategoryByName(Name name);
}
