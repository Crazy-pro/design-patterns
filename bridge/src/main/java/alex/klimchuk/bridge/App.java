package alex.klimchuk.bridge;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class App {

    public static void main(String[] args) {
        Color red = new Red();
        Color blue = new Blue();

        Shape redCircle = new Circle(red);
        Shape blueRectangle = new Rectangle(blue);

        redCircle.applyColor();
        blueRectangle.applyColor();
    }
}
