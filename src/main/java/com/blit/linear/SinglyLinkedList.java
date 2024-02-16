package com.blit.linear;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import static java.lang.String.valueOf;


@Getter
@Setter

@ToString


public class SinglyLinkedList<E> implements List<E> {

    private SinglyLinkedListNode<E> tailNode;
    private int size = 0;

    public SinglyLinkedList(E data) {
        this.tailNode = new SinglyLinkedListNode<>(data);
        this.tailNode.setNext(null);
        this.setSize(1);
    }


    @Override
    public boolean isEmpty() {
        try {
            return this.size() == 0;

        } catch (NullPointerException e) {

            return false;
        }


    }

    @Override
    public long size() {

        return this.size;
    }


    @Override
    public E add(E data) {

        SinglyLinkedListNode<E> newNode = new SinglyLinkedListNode<>(data);
        SinglyLinkedListNode traversalNode = this.tailNode;

        while (traversalNode.getNext() != null) {
            traversalNode = traversalNode.getNext();
        }
        traversalNode.setNext(newNode);
        this.setSize(this.getSize() + 1);
        this.print();
        return newNode.getData();
    }

    @Override
    public boolean remove(E data) {
        if (this.getSize() == 0) {
            return false;
        } else {
            SinglyLinkedListNode<E> traversalNode = this.tailNode;
            SinglyLinkedListNode<E> previousNode = traversalNode;
            while (traversalNode != null) {

                if (traversalNode.getData().equals(data)) {
                    if (getSize() == 1) {
                        this.setTailNode(null);
                        this.setSize(0);
                        return true;
                    } else {

                        previousNode.setNext(traversalNode.getNext());

                        this.setSize(this.getSize() - 1);
                        this.print();
                        return true;
                    }
                } else {
                    previousNode = traversalNode;
                    traversalNode = traversalNode.getNext();
                }


            }


            System.err.println("Could not find node with " + data);
            return false;
        }


    }

    @Override
    public boolean remove(SinglyLinkedListNode<E> node) {
        return false;
    }


    @Override
    public ListIterator<E> iterator() {
        return null;
    }

    public void print() {
        SinglyLinkedListNode<E> traversalNode = this.tailNode;
        while (traversalNode != null) {
            if (tailNode == traversalNode) {
                System.out.print(traversalNode.getData());
            } else {
                System.out.print(" --> " + traversalNode.getData());
            }
            traversalNode = traversalNode.getNext();

        }
        System.out.println();
    }
}
