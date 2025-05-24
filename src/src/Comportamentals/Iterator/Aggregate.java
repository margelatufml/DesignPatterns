package Comportamentals.Iterator;

public interface Aggregate<T> {
    Iterator<T> createIterator();
} 