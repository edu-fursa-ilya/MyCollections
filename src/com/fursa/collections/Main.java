package com.fursa.collections;

import com.fursa.collections.intf.MyCollection;
import com.fursa.collections.lists.MyArrayList;

public class Main {

    public static void main(String[] args) {
        MyCollection<String> list = new MyArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("What's good people? " + i + " times!");
        }

        list.remove(1);
        System.out.println(list.size());

        for (String s: list) {
            System.out.println("Output: " + s);
        }

    }
}
