package alex.klimchuk.proxy;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class App {

    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        image1.display();
        image1.display(); // Image loaded from cache
        image2.display();
        image2.display(); // Image loaded from cache
        image2.display(); // Image loaded from cache
    }
}
