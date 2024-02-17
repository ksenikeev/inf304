package ru.itis.inf304.lab2_2;

/**
 * Внутренняя структура - связный список
 */
public class List304ImplAsLinkedList implements List304 {

    private int size;
    private Node head;

    @Override
    public void add(Object e) {
        Node n = new Node(e);
        if (head == null) {
            head = n;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(n);
        }
        size++;
    }

    @Override
    public Object get(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void delete(int index)  {

    }

    @Override
    public Object pop() {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        for (int i = 0; i < size; i++) {
            sb.append(", ").append(current.getValue());
            current = current.getNext();
        }
        return sb.toString();
    }
}
