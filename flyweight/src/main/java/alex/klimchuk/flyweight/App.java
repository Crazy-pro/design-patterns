package alex.klimchuk.flyweight;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class App {

    public static void main(String[] args) {
        Shape redCircle = ShapeFactory.getCircle("red");
        redCircle.draw();

        Shape blueCircle = ShapeFactory.getCircle("blue");
        blueCircle.draw();

        Shape greenCircle = ShapeFactory.getCircle("green");
        greenCircle.draw();

        Shape redCircle2 = ShapeFactory.getCircle("red");
        redCircle2.draw();
    }
}
