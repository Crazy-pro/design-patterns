package alex.klimchuk.prototype;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public abstract class Shape implements Cloneable {
    protected String type;

    abstract void draw();

    public String getType() {
        return type;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
