package com.stablepriorityqueue;

/**
 * Created by jugal on 8/23/2016.
 */
public class Element implements Comparable<Element> {
    private long time;

    public Element(int key, Object o) {
        this.key = key;
        this.value = o;
        this.time = System.nanoTime();
    }

    private int key;
    private Object value;
    
    public Object getValue() {
    	return value;
    }

    public int compareTo(Element other) {
        int result = Integer.compare(this.key, other.key);
        if (result == 0) {
            return Long.compare(other.time, this.time);
        } else {
            return result;
        }
    }

    public String toString() {
        return String.format("%s: %s", key, value);
    }
}
