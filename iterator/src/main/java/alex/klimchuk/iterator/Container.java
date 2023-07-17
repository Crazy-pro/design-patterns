package alex.klimchuk.iterator;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public interface Container<T> {
    Iterator<T> createIterator();
}
