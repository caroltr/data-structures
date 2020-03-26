package com.cribeiro;

public class LinkedList {

    private Node head;
    private Node tail;

    // O(n)- add at tail
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

    // O(n)
    public Node get(int element) {

        Node current = head;

        while (current.getData() != element) {
            current = current.getNext();
        }

        return current;
    }

    public void insertAt(int element, int index) {

        Node newNode = new Node(element);
        Node current = head;
        int position = -1;

        // Find position
        while (position < index - 1) {
            current = current.getNext();
            position++;
        }

        // Insert at position fixing the links
        insert(current, newNode);

        if (index == 0) {
            head = newNode;
        }
    }

    public void delete(int element) {
        Node current = get(element);

        Node nodeToDeletesPrevious = current.getPrevious();
        Node nodeToDeletesNext = current.getNext();

        if (nodeToDeletesPrevious != null) {
            nodeToDeletesPrevious.setNext(nodeToDeletesNext);
        } else {
            head = nodeToDeletesNext;
        }

        if (nodeToDeletesNext != null) {
            nodeToDeletesNext.setPrevious(nodeToDeletesPrevious);
        } else {
            tail = nodeToDeletesPrevious;
        }
    }

    private void insert(Node nextToNewNode, Node newNode) {

        Node previousToNewNode;
        if (nextToNewNode == null) {
            previousToNewNode = tail;
            tail = newNode;
        } else {
            previousToNewNode = nextToNewNode.getPrevious();
        }

        if (previousToNewNode != null) {
            previousToNewNode.setNext(newNode);
        }

        newNode.setPrevious(previousToNewNode);
        if (nextToNewNode != null) {
            nextToNewNode.setPrevious(newNode);
        }

        newNode.setNext(nextToNewNode);
    }

    @Override
    public String toString() {
        return "LinkedList [head=" + head + "]";
    }
}
