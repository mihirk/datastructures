package org.singlylinkedlist;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class SinglyLinkedListTest {
    @Test
    public void shouldBeAbleToAddElementsToList() throws Exception {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Object[] integers = list.toArray();
        assertEquals(4, list.length());
        assertArrayEquals(new Integer[]{4, 3, 2, 1}, integers);
    }

    @Test
    public void shouldBeSize0IfNoElementsAdded() throws Exception {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        assertEquals(0, list.length());
        assertArrayEquals(new Integer[]{}, list.toArray());
    }

    @Test
    public void shouldBeAbleToAddRedundantElements() throws Exception {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        assertEquals(3, list.length());
        assertArrayEquals(new Integer[]{1, 1, 1}, list.toArray());
    }

    @Test
    public void shouldBeAbleToCreateListsOfStringType() throws Exception {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        assertEquals(4, list.length());
        assertArrayEquals(new String[]{"D", "C", "B", "A"}, list.toArray());
    }

    @Test
    public void shouldBeAbleToCreateListsOfBooleanType() throws Exception {
        SinglyLinkedList<Boolean> list = new SinglyLinkedList<>();
        list.add(Boolean.FALSE);
        list.add(Boolean.TRUE);
        list.add(Boolean.TRUE);
        list.add(Boolean.TRUE);
        assertEquals(4, list.length());
        assertArrayEquals(new Boolean[]{Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.FALSE}, list.toArray());
    }

    @Test
    public void shouldBeAbleToCreateListsOfAnyType() throws Exception {
        SinglyLinkedList<Double> list = new SinglyLinkedList<>();
        list.add(1.123);
        list.add(232.332);
        list.add(32.23);
        list.add(3333.222);
        assertEquals(4, list.length());
        assertArrayEquals(new Double[]{3333.222, 32.23, 232.332, 1.123}, list.toArray());
    }
}