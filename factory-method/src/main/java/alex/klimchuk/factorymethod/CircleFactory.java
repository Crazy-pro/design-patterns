package alex.klimchuk.factorymethod;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class CircleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
