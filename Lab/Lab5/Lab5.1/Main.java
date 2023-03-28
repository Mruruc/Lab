

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

    class Main {
        static class Key {
            private static long cmpCount = 0L;
            private long value = 0L;

            public static void resetCounter() {
                cmpCount = 0L;
            }

            public static long getCmpCount() {
                return cmpCount;
            }

            public Key() {}

            public Key(long v) {
                value = v;
            }

            public long getKey() {
                return value;
            }

            public boolean equals(Key v) {
                ++cmpCount;
                return value == v.value;
            }

            public boolean lessThan(Key v) {
                ++cmpCount;
                return value < v.value;
            }

            public boolean lessThanOrEqual(Key v) {
                ++cmpCount;
                return value <= v.value;
            }

            public boolean greaterThan(Key v) {
                ++cmpCount;
                return value > v.value;
            }

            public boolean greaterThanOrEqual(Key v) {
                ++cmpCount;
                return value >= v.value;
            }
        }

        static long binaryCmpCount = 0L;
        static long trivialCmpCount = 0L;

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int n = 0;
            do {
                System.out.print("Collection size: ");
                n = input.nextInt();
                if (n <= 0) {
                    break;
                }

                System.out.print("Number of searches: ");
                int findCount = input.nextInt();

                List<Key> v = new ArrayList<>(n);

                for (int i = 0; i < n; i++) {
                    Key key = new Key(ThreadLocalRandom.current().nextLong());
                    v.add(key);
                }

                Collections.sort(v, (a, b) -> Long.compare(a.getKey(), b.getKey()));

                binaryCmpCount = 0L;
                trivialCmpCount = 0L;

                for (int i = 0; i < findCount; i++) {
                    Key key = new Key(ThreadLocalRandom.current().nextLong());

                    Key.resetCounter();
                    Methods.binarySearch(v, key);
                    binaryCmpCount += Key.getCmpCount();

                    Key.resetCounter();
                    Methods.trivialSearch(v, key);
                    trivialCmpCount += Key.getCmpCount();
                }

                if (findCount > 0) {
                    System.out.println("Cmp count (collection size: " + n + ")");
                    System.out.println("\t findBinary: " + binaryCmpCount / findCount);
                    System.out.println("\tfindTrivial: " + trivialCmpCount / findCount);
                }
            } while (n > 0);
        }


    }

