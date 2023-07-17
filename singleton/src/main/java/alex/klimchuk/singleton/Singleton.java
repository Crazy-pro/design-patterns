package alex.klimchuk.singleton;

import java.util.Objects;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (Singleton.class) {
                if (Objects.isNull(instance)) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Singleton has been moved to the survivor heap");
    }
}
