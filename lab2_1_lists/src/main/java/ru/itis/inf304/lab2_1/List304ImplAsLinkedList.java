package ru.itis.inf304.lab2_1;

/**
 * Внутренняя структура - связный список
 */
public class List304ImplAsLinkedList implements List304 {

    @Override
    public void add(Integer e) throws EmptyElementException {
        Integer[] arr = new Integer[10];
        Integer[] temp = new Integer[20];

        System.arraycopy(arr, 0, temp, 0, arr.length);
        arr = temp;
    }

    @Override
    public Integer get(int index) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void delete(int index) throws IndexOutOfBoundsException {

    }

    @Override
    public Integer pop() {
        return null;
    }
}
