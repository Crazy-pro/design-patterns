package alex.klimchuk.prototype;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}
