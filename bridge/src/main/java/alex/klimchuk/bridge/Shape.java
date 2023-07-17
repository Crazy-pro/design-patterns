package alex.klimchuk.bridge;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public abstract class Shape {
    protected Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    abstract void applyColor();
}
