package org.singlylinkedlisttdd;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SinglyLinkedListTest {
    @Test
    public void createAnEmptyList() throws Exception {
        SinglyLinkedList list = new SinglyLinkedList();
        assertTrue(list.isEmpty());
    }

    @Test
    public void addAnIntegerToTheList() throws Exception {
        SinglyLinkedList list = new SinglyLinkedList();
        assertFalse(list.isEmpty());
    }
}
