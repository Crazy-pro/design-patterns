package alex.klimchuk.facade;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class Memory {
    public void load(long position, byte[] data) {
        System.out.println("Loading data at position " + position);
    }
}
