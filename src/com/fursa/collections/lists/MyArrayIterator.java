package com.fursa.collections.lists;


import java.util.Iterator;

public class MyArrayIterator<E> implements Iterator<E> {

    private int index = 0;
    E[] vals;

    public MyArrayIterator(E[] vals) {
        this.vals = vals;
    }

    @Override
    public boolean hasNext() {
        return index < vals.length;
    }

    @Override
    public E next() {
        return vals[index++];
    }
}
