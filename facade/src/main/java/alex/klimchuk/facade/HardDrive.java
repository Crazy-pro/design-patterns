package alex.klimchuk.facade;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("Reading data from HDD");
        return new byte[size];
    }
}
