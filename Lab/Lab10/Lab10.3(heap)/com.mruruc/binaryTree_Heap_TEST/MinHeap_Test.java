package binaryTree_TEST.binaryTree_Heap_TEST;

import com.mruruc.heap.HeapMin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


class  MinHeap_Test {

    private HeapMin heap;

    @BeforeEach
    void setUp() {
        heap = new HeapMin(7);
        heap.insert(13);
        heap.insert(24);
        heap.insert(15);
        heap.insert(7);
        heap.insert(3);
        heap.insert(-1);
    }

    @Test
    void testInsertAndExtractMin() {
        assertEquals(-1, heap.extractMin());
        assertEquals(3, heap.extractMin());
        assertEquals(7, heap.extractMin());
        assertEquals(13, heap.extractMin());
        assertEquals(15, heap.extractMin());
    }

    @Test
    void testDelete() {
        heap.delete(3); // Delete element 7
        assertEquals(-1, heap.extractMin());
        assertEquals(3, heap.extractMin());
        assertEquals(7, heap.extractMin());
        assertEquals(13, heap.extractMin());
    }

    @Test
    void test_isFull(){
        assertFalse(heap.isFull());
    }
    @Test
    void test_isEmpty(){
        assertFalse(heap.isEmpty());
    }
    @Test
    void test_getHeapSize(){
        assertEquals(6,heap.getHeap_Size());
    }

    @Test
    void testUpdate() {
        heap.update(1, 5);
        assertEquals(-1, heap.extractMin());
        assertEquals(3, heap.extractMin());
        assertEquals(5, heap.extractMin());
        assertEquals(13, heap.extractMin());
    }

    @Test
    void testHeapSortASC() {
        ArrayList<Integer> sortedList = heap.heapSortASC();
        assertEquals(Arrays.asList(-1, 3, 7, 13, 15, 24), sortedList);
    }

}
