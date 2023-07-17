package alex.klimchuk.abstractfactory;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
