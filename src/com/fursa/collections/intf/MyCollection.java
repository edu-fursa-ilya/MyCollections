package com.fursa.collections.intf;

public interface MyCollection<E> extends Iterable<E> {

    boolean add(E e);

    void add(int index, E e);

    void remove(int index);

    E get(int index);

    int size();

}
