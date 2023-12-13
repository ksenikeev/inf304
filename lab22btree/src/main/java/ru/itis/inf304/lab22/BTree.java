package ru.itis.inf304.lab22;

public class BTree implements IBTree {

    private Node root;

    private int currentLevel = 0;
    private int countLevelElements = 0;

    @Override
    public void siftUp(Node node) {

    }

    @Override
    public void siftDown(Node node) {

    }

    @Override
    public void add(int value) {
        if (root == null) {
            root = new Node(value);
            countLevelElements = 1;
        } else {

        }
    }

    @Override
    public int popRoot() {
        return 0;
    }
}
