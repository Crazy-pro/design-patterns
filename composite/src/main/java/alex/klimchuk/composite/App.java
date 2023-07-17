package alex.klimchuk.composite;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class App {

    public static void main(String[] args) {
        Employee developer1 = new Developer("John Doe", "Senior Developer");
        Employee developer2 = new Developer("Jane Smith", "Junior Developer");

        Manager manager = new Manager("Mike Johnson", "Development Manager");
        manager.add(developer1);
        manager.add(developer2);

        manager.showDetails();
    }
}
