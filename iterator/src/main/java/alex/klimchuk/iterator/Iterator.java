package alex.klimchuk.iterator;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public interface Iterator<T> {
    boolean hasNext();

    T next();
}
