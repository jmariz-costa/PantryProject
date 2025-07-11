package com.jmariz.pantry.ddd;

import java.util.Optional;

public interface IRepository <ID extends DomainId, T extends AggregateRoot<ID>> {

    T save(T entity);

    Iterable<T> findAll();

    Optional<T> ofIdentity(ID id);

    boolean containsOfIdentity(ID id);
}
