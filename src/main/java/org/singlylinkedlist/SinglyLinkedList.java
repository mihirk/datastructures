package org.singlylinkedlist;

import org.singlylinkedlist.model.Node;

public class SinglyLinkedList<T> {
    private Node<T> head;

    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.setNext(head);
        head = newNode;
    }
}
