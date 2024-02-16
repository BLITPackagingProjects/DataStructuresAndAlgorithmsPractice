package com.blit.linear;


import lombok.*;


@RequiredArgsConstructor
@Getter
@Setter
@Builder

public class ListIterator<E> {
    private final List<E> list;




    public boolean hasNext(){
        return false;
    }
    public List<E> next(){
        return null;
    }


}
