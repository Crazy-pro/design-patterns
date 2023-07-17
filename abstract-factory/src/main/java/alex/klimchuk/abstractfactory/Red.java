package alex.klimchuk.abstractfactory;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Filling with red color");
    }
}
