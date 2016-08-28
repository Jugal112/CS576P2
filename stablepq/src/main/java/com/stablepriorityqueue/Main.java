package com.stablepriorityqueue;

import java.util.ArrayList;

/**
 * Created by jugal on 8/23/2016.
 */
public class Main {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.insert(new Element(1, "hif"));
        System.out.println(pq);
        pq.insert(new Element(3, "helflo"));
        System.out.println(pq);
        pq.insert(new Element(7, "fok"));
        System.out.println(pq);
        pq.insert(new Element(2, "wf"));
        System.out.println(pq);
        pq.insert(new Element(5, "ehf"));
        System.out.println(pq);
        pq.insert(new Element(1, "a"));
        pq.insert(new Element(6, "erfh"));
        System.out.println(pq);
        pq.insert(new Element(3, "vsferv"));
        System.out.println(pq);
        pq.insert(new Element(9, "aefrver"));
        System.out.println(pq);
        pq.insert(new Element(5, "hif"));
        pq.insert(new Element(1, "b"));
        System.out.println(pq);
        pq.insert(new Element(4, "hello"));
        System.out.println(pq);
        pq.insert(new Element(2, "ok"));
        pq.insert(new Element(1, "c"));
        System.out.println(pq);
        pq.insert(new Element(3, "w"));
        System.out.println(pq);
        pq.insert(new Element(9, "eh"));
        System.out.println(pq);
        pq.insert(new Element(8, "erh"));
        System.out.println(pq);
        pq.insert(new Element(4, "vserv"));
        System.out.println(pq);
        pq.insert(new Element(1, "aerver"));
        pq.insert(new Element(1, "d"));
        System.out.println(pq);

        ArrayList<Element> sorted_elements = new ArrayList<>();
        int size = pq.size();
        System.out.println("Extracting maximums");
        for (int i = 0; i < size; i++) {
            System.out.println(pq.size() + " " + i);
            Element max = pq.extractMaximum();
            System.out.println("got "+max);
            System.out.println(pq);
            sorted_elements.add(max);
        }
        System.out.println("sorted: " + sorted_elements);
    }


}