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


            long start = System.nanoTime();
            HeapMax heap = new HeapMax(n);
            for (int i = 0; i < n; i++) {
                int element = random.nextInt();
                heap.insert(element);
            }

            long end = System.nanoTime();
            System.out.println(end-start);

        }while(n >0);
    }
}

