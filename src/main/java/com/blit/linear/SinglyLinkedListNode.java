package com.blit.linear;


import lombok.*;


@Getter
@Setter



public class SinglyLinkedListNode<E> {

    private E data;
    private SinglyLinkedListNode<E> next = null;

    public SinglyLinkedListNode(E data) {
        this.data = data;
    }







    @Override
    public String toString(){
        return String.valueOf(this.data);
    }



}



