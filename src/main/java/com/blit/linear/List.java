package com.blit.linear;



public interface List<E> {


    boolean isEmpty();
    long size();

    E add(E data);


    boolean remove(E data);


    boolean remove(SinglyLinkedListNode<E> node);

    ListIterator<E> iterator();

}
