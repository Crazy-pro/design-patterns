package alex.klimchuk.abstractfactory;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class ConcreteFactory implements AbstractFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }

    @Override
    public Color createColor() {
        return new Red();
    }
}
