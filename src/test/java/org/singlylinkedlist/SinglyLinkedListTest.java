package org.singlylinkedlist;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
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

    @Test
    public void shouldBeAbleToRemoveElementsFromListHead() throws Exception {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3, list.length());
        assertArrayEquals(new Integer[]{3, 2, 1}, list.toArray());
        boolean remove = list.remove(3);
        assertTrue(remove);
        assertEquals(2, list.length());
        assertArrayEquals(new Integer[]{2, 1}, list.toArray());
    }

    @Test
    public void shouldBeAbleToRemoveElementsFromListMidst() throws Exception {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3, list.length());
        assertArrayEquals(new Integer[]{3, 2, 1}, list.toArray());
        boolean remove = list.remove(2);
        assertTrue(remove);
        assertEquals(2, list.length());
        assertArrayEquals(new Integer[]{3, 1}, list.toArray());
    }

    @Test
    public void shouldBeAbleToRemoveElementsFromListEnd() throws Exception {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3, list.length());
        assertArrayEquals(new Integer[]{3, 2, 1}, list.toArray());
        boolean remove = list.remove(1);
        assertTrue(remove);
        assertEquals(2, list.length());
        assertArrayEquals(new Integer[]{3, 2}, list.toArray());
    }

    @Test
    public void removeShouldFailInCaseOfElementNotFound() throws Exception {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3, list.length());
        assertArrayEquals(new Integer[]{3, 2, 1}, list.toArray());
        boolean remove = list.remove(100);
        assertFalse(remove);
        assertEquals(3, list.length());
        assertArrayEquals(new Integer[]{3, 2, 1}, list.toArray());
    }

    @Test
    public void shouldBeAbleToInsertElementAt1() throws Exception {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3, list.length());
        assertArrayEquals(new Integer[]{3, 2, 1}, list.toArray());
        list.insert(5, 1);
        assertEquals(4, list.length());
        assertArrayEquals(new Integer[]{3, 5, 2, 1}, list.toArray());
    }

    @Test
    public void shouldBeAbleToInsertElementAt2() throws Exception {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3, list.length());
        assertArrayEquals(new Integer[]{3, 2, 1}, list.toArray());
        list.insert(5, 2);
        assertEquals(4, list.length());
        assertArrayEquals(new Integer[]{3, 2, 5, 1}, list.toArray());
    }

    @Test
    public void shouldBeAbleToInsertElementAtLast() throws Exception {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3, list.length());
        assertArrayEquals(new Integer[]{3, 2, 1}, list.toArray());
        list.insert(5, 3);
        assertEquals(4, list.length());
        assertArrayEquals(new Integer[]{3, 2, 1, 5}, list.toArray());
    }

    @Test
    public void shouldBeAbleToInsertElementIfInvalidPosition() throws Exception {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3, list.length());
        assertArrayEquals(new Integer[]{3, 2, 1}, list.toArray());
        list.insert(5, 4);
        assertEquals(3, list.length());
        assertArrayEquals(new Integer[]{3, 2, 1}, list.toArray());
    }

    @Test
    public void shouldBeAbleToInsertElementAtHead() throws Exception {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3, list.length());
        assertArrayEquals(new Integer[]{3, 2, 1}, list.toArray());
        list.insert(5, 0);
        assertEquals(4, list.length());
        assertArrayEquals(new Integer[]{5, 3, 2, 1}, list.toArray());
    }

}