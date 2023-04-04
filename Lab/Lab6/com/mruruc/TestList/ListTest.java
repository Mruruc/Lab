package com.mruruc.TestList;

import com.mruruc.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListTest {

    @Test
    public void sizeTest(){
        List list=new List();
        list.addFirst(2);
        list.addFirst(7);
        list.addFirst(0);
        list.addFirst(5);
        assertEquals(4,list.size2());
    }
    @Test
    public void size_Test_Zero_Element(){
        List list=new List();
        assertEquals(0,list.size2());
    }

    @Test
    public void exists_Test_Zero_Element(){
        List list=new List();
        assertFalse(list.exists(5));
    }

    @Test
    public void exists_Test_One_Element(){
        List list=new List();
        list.addFirst(5);
        assertTrue(list.exists(5));
    }

    @Test
    public void exists_Test_More_Element(){
        List list=new List();
        list.addFirst(5);
        list.addFirst(2);
        list.addFirst(9);
        list.addFirst(48);
        list.addFirst(14);
        list.addFirst(67);
        list.addFirst(91);
        assertTrue(list.exists(14));
    }
}
