package alex.klimchuk.decorator;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class App {

    public static void main(String[] args) {
        Pizza margherita = new Margherita();
        margherita = new Cheese(margherita);
        margherita = new Tomato(margherita);

        System.out.println("Pizza: " + margherita.getDescription());
        System.out.println("Cost: $" + margherita.getCost());
    }
}
