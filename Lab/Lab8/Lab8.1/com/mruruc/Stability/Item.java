package com.mruruc.Stability;

public class Item {
        private final int key;
        private final int value;

        public Item(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }

        @Override
        public String toString() {
            return key + " (" + value + ")";
        }
    }
