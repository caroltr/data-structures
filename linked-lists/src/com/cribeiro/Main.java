package com.cribeiro;

public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add(7);
        list.add(13);
        list.add(1);
        list.add(4);

//        System.out.println(list);

        Node find = list.get(1);
//        System.out.println(find);

        list.insertAt(8, 0);
        System.out.println(list);

    }
}
