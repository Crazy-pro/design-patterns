package alex.klimchuk.bridge;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    void applyColor() {
        System.out.print("Circle filled with ");
        color.applyColor();
    }
}
