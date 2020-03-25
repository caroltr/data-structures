package com.cribeiro;

public class LinkedList {

    private Node head;
    private Node tail;

    public void add(int element) {

        Node newNode = new Node(element);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
        }

        tail = newNode;
    }

    @Override
    public String toString() {
        return "LinkedList [head=" + head + "]";
    }
}
