package com.fursa.collections.lists;

import com.fursa.collections.intf.MyCollection;

import java.util.Iterator;

public class MyArrayList<E> implements MyCollection<E> {
    private static final int DEFAULT_LIST_SIZE = 0;
    private E[] arr;

    public MyArrayList() {
        arr = (E[]) new Object[DEFAULT_LIST_SIZE];
    }

    @Override
    public boolean add(E e) {
        try {
            E[] tmp = arr;
            arr = (E[]) new Object[tmp.length + 1];
            System.arraycopy(tmp, 0, arr, 0, tmp.length);
            arr[arr.length - 1] = e;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void add(int index, E e) {
        arr[index] = e;
    }

    //note: System.arraycopy works better
    @Override
    public void remove(int index) {
       try {
           E[] tmp = arr;
           arr = (E[]) new Object[tmp.length - 1];
           System.arraycopy(tmp, 0, arr, 0, index);
           int amountElemAfterIndex = tmp.length - index - 1;
           System.arraycopy(tmp, index + 1, arr, index, amountElemAfterIndex);
       } catch (ClassCastException ex) {
           ex.printStackTrace();
       }
    }

    @Override
    public E get(int index) {
        return arr[index];
    }

    @Override
    public int size() {
        return arr.length;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyArrayIterator<>(arr);
    }
}
