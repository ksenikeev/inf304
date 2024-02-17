package ru.itis.inf304.lab2_1;

/**
    Список из однотипных элементов Integer
    позиционный (каждый элемент занимает определенную позицию)
 */
public interface List304 {
    void add(Integer e) throws EmptyElementException;

    Integer get(int index) throws IndexOutOfBoundsException;

    int size();

    void delete(int index) throws IndexOutOfBoundsException;
    /** Возвращаем последний элемент, и удаляем его из списка */
    Integer pop();
}
