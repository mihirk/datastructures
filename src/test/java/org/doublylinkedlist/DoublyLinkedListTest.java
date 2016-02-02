package org.doublylinkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class DoublyLinkedListTest {
    @Test
    public void emptyListWhenNoIntegerInserted() throws Exception {
        DoublyLinkedList list = new DoublyLinkedList();
        assertTrue(list.isEmpty());
    }

    @Test
    public void nonEmptyListWhenIntegerAreInserted() throws Exception {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.insert(0);
        list.insert(1);
        assertFalse(list.isEmpty());
    }

    @Test
    public void theFistIntegerInsertedSholdBetheHead() throws Exception {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.insert(9);
        assertEquals(9, list.getHead().getValue().intValue());
    }

    @Test
    public void shouldAcceptStringTypeAsValue() throws Exception {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.insert("HELLO WORLD");
        assertEquals("HELLO WORLD", list.getHead().getValue());
    }

    @Test
    public void shouldHaveHeadAsNullIfNothingIsInserted() throws Exception {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        assertNull(list.getHead());
    }

    @Test
    public void shouldHaveTheSecondElementNextToHead() throws Exception {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.insert("1");
        list.insert("2");
        assertEquals("2", list.getHead().getNext().getValue());
    }

    @Test
    public void shouldHaveTheSecondElementPreviousPointToHead() throws Exception {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.insert("1");
        list.insert("2");
        assertEquals("1", list.getHead().getNext().getPrevious().getValue());
    }

}