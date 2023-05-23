import java.util.*;
import java.time.*;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        do {
            System.out.print("Size: ");
            n = scanner.nextInt();

            Random random = new Random(System.currentTimeMillis());

            HeapMax heap = new HeapMax(n);
            for (int i = 0; i < n; i++) {
                int element = random.nextInt();
                heap.insert(element);
            }

            if (n > 0) {
               long start=System.nanoTime();
                for (int i = 0; i < n; i++) {
                    heap.extractMax();
                }
                long end = System.nanoTime();

                long millis = TimeUnit.NANOSECONDS.toMillis(end -start);
                System.out.println(millis);

            }
        } while (n > 0);
    }
}
