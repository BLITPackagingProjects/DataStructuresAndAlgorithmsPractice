package com.blit.linear;

import org.slf4j.LoggerFactory;


import java.util.Arrays;

import static java.lang.String.valueOf;

public class ListApplication {

    public static void main(String[] args) {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>(0);
        singlyLinkedList.add(1);
        singlyLinkedList.add(2);
        singlyLinkedList.add(3);
        singlyLinkedList.add(4);
        singlyLinkedList.add(5);
        singlyLinkedList.add(6);
        singlyLinkedList.add(7);
        singlyLinkedList.add(8);
        singlyLinkedList.add(9);
        singlyLinkedList.add(10);
        singlyLinkedList.add(11);
        singlyLinkedList.add(12);
        singlyLinkedList.add(13);
        singlyLinkedList.add(14);
        singlyLinkedList.add(15);
        singlyLinkedList.add(16);
        singlyLinkedList.add(17);
        singlyLinkedList.add(18);
        singlyLinkedList.add(19);

        System.out.println(singlyLinkedList);

        singlyLinkedList.remove(16);
        singlyLinkedList.print();
    }
}
