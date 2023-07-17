package alex.klimchuk.prototype;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class App {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        try {
            Shape clonedCircle = (Shape) circle.clone();
            System.out.println("Cloned Shape Type: " + clonedCircle.getType());

            Shape clonedRectangle = (Shape) rectangle.clone();
            System.out.println("Cloned Shape Type: " + clonedRectangle.getType());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
