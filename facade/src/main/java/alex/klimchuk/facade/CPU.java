package alex.klimchuk.facade;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class CPU {
    public void freeze() {
        System.out.println("Freezing CPU");
    }

    public void jump(long position) {
        System.out.println("Jumping to position: " + position);
    }

    public void execute() {
        System.out.println("Executing CPU instructions");
    }
}
