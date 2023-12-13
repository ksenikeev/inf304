package ru.itis.inf304.lab22;

public class BTree implements IBTree {

    private Node root;

    private int currentLevel = 0;
    private int bufferPosition = 0;
    private int countLevelElements = 0;

    private Node[] currentLevelBufer;
    private Node[] tempBufer;
    private int tempBuferPosition = 0;

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
            currentLevel = 1;
            currentLevelBufer = new Node[1];
            currentLevelBufer[0] = root;
        } else {
            if (tempBuferPosition == (2 << (currentLevel - 1)) - 1 ) {
                currentLevelBufer = tempBufer;
                tempBufer = null;
            }

            if (tempBufer == null) {
                tempBufer = new Node[2 << (currentLevel-1)];
                currentLevel++;
                tempBuferPosition = 0;
                bufferPosition = 0;
            }
            Node node = currentLevelBufer[bufferPosition];
            Node tmp = new Node(value);
            if (node.left == null) {
                node.left = tmp;
            } else {
                node.right = tmp;
                bufferPosition++;
            }
            tempBuferPosition++;
        }
    }

    @Override
    public int popRoot() {
        return 0;
    }
}
