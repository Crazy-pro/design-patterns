package alex.klimchuk.bridge;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    void applyColor() {
        System.out.print("Rectangle filled with ");
        color.applyColor();
    }
}
