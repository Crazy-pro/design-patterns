package alex.klimchuk.proxy;

import java.util.Objects;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private final String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (Objects.isNull(realImage)) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
