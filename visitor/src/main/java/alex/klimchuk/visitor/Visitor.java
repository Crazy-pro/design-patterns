package alex.klimchuk.visitor;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public interface Visitor {
    void visit(Book book);

    void visit(Fruit fruit);
}
