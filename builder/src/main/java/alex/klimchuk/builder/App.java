package alex.klimchuk.builder;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class App {

    public static void main(String[] args) {
        Car car = Car.builder()
                .year(2023)
                .color("Blue")
                .build();

        car.drive(car);
    }
}
