package com.fursa.collections.lists;

import java.util.Iterator;

public class MyArrayIterator<E> implements Iterator<E> {
    private int index = 0;
    private E[] arr;

    public MyArrayIterator(E[] arr) {
        this.arr = arr;
    }

    @Override
    public boolean hasNext() {
        return index < arr.length;
    }

    @Override
    public E next() {
        return arr[index++];
    }
}
