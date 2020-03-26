package com.cribeiro;

public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add(7);
        list.add(13);
        list.add(1);
        list.add(4);

        Node find = list.get(1);
//        System.out.println(find);

//        list.insertAt(8, 0);

        list.delete(1);

        System.out.println(list);
    }
}
