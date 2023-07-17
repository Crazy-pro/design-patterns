package alex.klimchuk.visitor;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public interface Visitable {
    void accept(Visitor visitor);
}
