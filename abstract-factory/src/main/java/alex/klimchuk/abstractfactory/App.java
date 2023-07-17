package alex.klimchuk.abstractfactory;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class App {

    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory();
        Shape shape = factory.createShape();
        Color color = factory.createColor();

        shape.draw();
        color.fill();
    }
}
