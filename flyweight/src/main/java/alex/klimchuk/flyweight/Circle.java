package alex.klimchuk.flyweight;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class Circle implements Shape {
    private final String color;
    private final int x;
    private final int y;
    private final int radius;

    public Circle(String color) {
        this.color = color;
        this.x = 0;
        this.y = 0;
        this.radius = 10;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle [Color: " + color
                + ", x: " + x + ", y: " + y + ", radius: " + radius + "]");
    }
}
