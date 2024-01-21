package com.deadhead.iterator_pattern.specifications;

public interface Iterator<T> {
    boolean hasNext();
    T next();
}
