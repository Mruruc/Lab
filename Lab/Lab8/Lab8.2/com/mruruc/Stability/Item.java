package com.mruruc.Stability;

public class Item implements Comparable<Item> {
    private final int key;
    private final long value;

    public Item(int key, long value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public long getValue() {
        return value;
    }

    @Override
    public String toString() {
        return key + " (" + value + ")";
    }

    @Override
    public int compareTo(Item other) {
        return Integer.compare(this.key, other.key);
    }
}
