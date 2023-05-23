
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MaxHeap_Test {

    private HeapMax heapMax;

    @BeforeEach
    void setUp() {
        heapMax = new HeapMax(10);
    }

    @Test
    void insertAndPeek() {
        heapMax.insert(5);
        heapMax.insert(17);
        heapMax.insert(37);
        heapMax.insert(94);
        heapMax.insert(58);
        heapMax.insert(94);
        heapMax.insert(11);
        heapMax.insert(91);

        assertEquals(94, heapMax.peek());
    }

    @Test
    void extractMax() {
        heapMax.insert(5);
        heapMax.insert(17);
        heapMax.insert(37);
        heapMax.insert(94);
        heapMax.insert(58);
        heapMax.insert(94);
        heapMax.insert(11);
        heapMax.insert(91);

        assertEquals(94, heapMax.extractMax());
        assertEquals(94, heapMax.peek());
    }

    @Test
    void delete() {
        heapMax.insert(5);
        heapMax.insert(17);
        heapMax.insert(37);
        heapMax.insert(94);
        heapMax.insert(58);
        heapMax.insert(94);
        heapMax.insert(11);
        heapMax.insert(91);

        heapMax.delete(2);
        assertEquals(94, heapMax.peek());
        heapMax.delete(0);
        assertEquals(91, heapMax.peek());
    }

    @Test
    void update() {
        heapMax.insert(5);
        heapMax.insert(17);
        heapMax.insert(37);
        heapMax.insert(94);
        heapMax.insert(58);
        heapMax.insert(94);
        heapMax.insert(11);
        heapMax.insert(91);

        heapMax.update(1, 99);
        assertEquals(99, heapMax.peek());
        heapMax.update(0, 90);
        assertEquals(94, heapMax.peek());
    }

    @Test
    void test_heapSortDESC(){
        int[] dataSet = {5, 17, 37, 94, 58, 94, 11, 91};
        for (int value : dataSet) {
            heapMax.insert(value);
        }
        List<Integer> expected = Arrays.asList(94, 94, 91, 58, 37, 17, 11, 5);
        ArrayList<Integer> sortedList = heapMax.heapSortDESC();
        assertEquals(expected, sortedList);
    }
}

