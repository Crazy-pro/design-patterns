package alex.klimchuk.iterator;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class App {

    public static void main(String[] args) {
        String[] names = {"John", "Jane", "Bob"};

        NameRepository repository = new NameRepository(names);
        Iterator<String> iterator = repository.createIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println("Name: " + name);
        }
    }
}
