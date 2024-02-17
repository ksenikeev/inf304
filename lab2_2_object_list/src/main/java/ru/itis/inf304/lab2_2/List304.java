package ru.itis.inf304.lab2_2;

/**
    Список из однотипных элементов Integer
    позиционный (каждый элемент занимает определенную позицию)
 */
public interface List304 {
    void add(Object e);

    Object get(int index);

    int size();

    void delete(int index);
    /** Возвращаем последний элемент, и удаляем его из списка */
    Object pop();
}
