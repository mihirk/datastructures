package org.doublylinkedlist;

import org.doublylinkedlist.model.Node;

public class DoublyLinkedList<T> {
    private int size;
    private Node<T> head;

    public DoublyLinkedList() {
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insert(T element) {
        size += 1;
        Node<T> newNode = new Node<>();
        newNode.setValue(element);
        if (head == null) {
            head = newNode;
        } else {
            head.setNext(newNode);
        }
    }

    public Node<T> getHead() {
        return head;
    }
}
