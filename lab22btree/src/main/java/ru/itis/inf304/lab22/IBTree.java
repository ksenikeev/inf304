package ru.itis.inf304.lab22;

public interface IBTree {
    void siftUp(Node node);
    void siftDown(Node node);
    void add(int value);
    int popRoot();
}
