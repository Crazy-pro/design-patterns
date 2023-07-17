package alex.klimchuk.iterator;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class NameRepository implements Container<String> {
    private final String[] names;

    public NameRepository(String[] names) {
        this.names = names;
    }

    @Override
    public Iterator<String> createIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<String> {
        private int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public String next() {
            return names[index++];
        }
    }
}
