package ru.itis.inf304.lab2_2;

public class Main {
    public static void main(String[] args) {
        List304 lst = new List304ImplAsLinkedList();

        lst.add("1");
        lst.add(2);
        lst.add(3);
        lst.add(4);

        System.out.println((Integer)lst.get(0) + (Integer)lst.get(1));
    }
}
