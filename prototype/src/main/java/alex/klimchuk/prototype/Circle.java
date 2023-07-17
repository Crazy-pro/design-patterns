package alex.klimchuk.prototype;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}
