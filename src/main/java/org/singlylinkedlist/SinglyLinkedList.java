package org.singlylinkedlist;

import org.singlylinkedlist.model.Node;

public class SinglyLinkedList<T> {
    private Node<T> head;

    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.setNext(head);
        head = newNode;
    }

    private boolean remove(Node<T> nodeToRemove, Node<T> listPointer) {
        if (listPointer == null) {
            return false;
        } else if (nodeToRemove.equals(listPointer)) {
            head = listPointer.getNext();
            return true;
        } else if (nodeToRemove.equals(listPointer.getNext())) {
            listPointer.setNext(listPointer.getNext().getNext());
            return true;
        }
        return remove(nodeToRemove, listPointer.getNext());
    }

    public boolean remove(T element) {
        Node<T> nodeToRemove = new Node<>(element);
        return remove(nodeToRemove, head);
    }

    public int length(Node<T> listPointer, int totalLength) {
        if (listPointer == null) {
            return totalLength;
        }
        return length(listPointer.getNext(), ++totalLength);
    }

    public int length() {
        return length(head, 0);
    }

    public T[] toArray() {
        int listLength = this.length();
        T[] array = (T[]) new Object[listLength];
        Node listPointer = head;
        for (int i = 0; i < listLength; i++) {
            array[i] = (T) listPointer.getElement();
            listPointer = listPointer.getNext();
        }
        return array;
    }

}
