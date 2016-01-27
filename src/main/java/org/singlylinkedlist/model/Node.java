package org.singlylinkedlist.model;

public class Node<T> {
    private Node next;
    private T element;

    public Node(T element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
