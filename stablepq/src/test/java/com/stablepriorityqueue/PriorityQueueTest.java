package com.stablepriorityqueue;

import junit.framework.TestCase;

public class PriorityQueueTest extends TestCase {

	PriorityQueue pq;
	
	public void testPriorityQueue() {
		pq = new PriorityQueue();
		if (pq instanceof PriorityQueue) {
			assertTrue(true);
		} else {
			fail();
		}
	}

	public void testLeft() {
		pq = new PriorityQueue();
		assertEquals(pq.left(5), 10); 
	}

	public void testRight() {
		pq = new PriorityQueue();
		assertEquals(pq.right(5), 11); 
	}

	public void testSize() {
		pq = new PriorityQueue();
		assertEquals(pq.size(), 1);
		pq.insert(new Element(5, "a"));
		pq.insert(new Element(2, "n"));
		assertEquals(pq.size(), 3);
	}

	public void testInsert() {
		pq = new PriorityQueue();
		pq.insert(new Element(2, "b"));
		pq.insert(new Element(4, "c"));
		assertEquals(pq.extractMaximum().getValue(), "c");
	}

	public void testParent() {
		pq = new PriorityQueue();
		assertEquals(pq.parent(5), 2);
		assertEquals(pq.parent(4), 2);
	}

	public void testSwap() {
		pq = new PriorityQueue();
		Element a = new Element(4, "hi");
		Element b = new Element(5, "hello");
		pq.insert(a);
		pq.insert(b);
		assertEquals(pq.getElement(1), b);
		pq.swap(1, 2);
		assertEquals(pq.getElement(1), a);
	}

	public void testToString() {
		pq = new PriorityQueue();
		assertEquals(pq.toString(), "[0: ROOT]");
	}

	public void testMaximum() {
		pq = new PriorityQueue();
		pq.insert(new Element(2, "b"));
		pq.insert(new Element(4, "c"));
		assertEquals(pq.maximum().getValue(), "c");
	}

	public void testExtractMaximum() {
		pq = new PriorityQueue();
		pq.insert(new Element(2, "b"));
		pq.insert(new Element(4, "c"));
		assertEquals(pq.size(), 3);
		assertEquals(pq.extractMaximum().getValue(), "c");
		assertEquals(pq.size(), 2);
	}

}
