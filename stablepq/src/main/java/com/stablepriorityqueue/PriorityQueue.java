package com.stablepriorityqueue;

import java.util.ArrayList;

/**
 * Created by jugal on 8/23/2016.
 */
public class PriorityQueue {
    private ArrayList<Element> queue;
    
    public PriorityQueue() {
        this.queue = new ArrayList<Element>();
        queue.add(new Element(0, "ROOT"));
    }

    public int left(int i) {
        return i*2;
    }

    public int right(int i) {
        return i*2+1;
    }

    public int size() {
        return queue.size();
    }

    public void insert(Element element) {
        queue.add(element);
        System.out.println(toString());
        int index = queue.size()-1;

        while(index!=1) {
            if (element.compareTo(queue.get(parent(index)))==1) {
                swap(index, parent(index));
                System.out.println("--"+toString());
                index = parent(index);
            } else {
                break;
            }
        }
    }

    public int parent(int i) {
        return i/2;
    }

    public void swap(int i, int j) {
        Element temp = queue.get(i);
        queue.set(i, queue.get(j));
        queue.set(j, temp);
    }

    public String toString() {
        String s = "";
        for (Element element : queue) {
            s += String.format("[%s]", element.toString());
        }
        return s;
    }

    public Element maximum() {
        return queue.get(1);
    }

    public Element extractMaximum() {
        if (queue.size() < 2) {
            return null;
        } else if (queue.size()==2) {
            return queue.remove(queue.size()-1);
        } else {
            Element maximum = maximum();
            int index = 1;
            queue.set(index, queue.remove(queue.size()-1));
            Element current = queue.get(1);

            while (true) {
                int right_index = right(index);
                int left_index = left(index);
                if (right_index < queue.size()
                        && queue.get(right_index).compareTo(queue.get(left_index)) == 1
                        && queue.get(right_index).compareTo(current) == 1) {
                    swap(index, right_index);
                    index = right_index;
                } else if (left_index < queue.size()
                        && queue.get(left_index).compareTo(current) == 1){
                    swap(index, left_index);
                    index = left_index;
                } else {
                    break;
                }
            }

            return maximum;
        }
    }
}
