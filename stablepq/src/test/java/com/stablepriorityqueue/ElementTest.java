package com.stablepriorityqueue;

import junit.framework.TestCase;

public class ElementTest extends TestCase {

	Element element;
	
	public void testElement() {
		element = new Element(5, "hi");
		if (element instanceof Element) {
			assertTrue(true);
		} else {
			fail();
		}
	}

	public void testGetValue() {
		element = new Element(5, "hi");
		assertEquals(element.getValue(), "hi");
	}

	public void testCompareTo() {
		element = new Element(5, "hi");
		assertEquals(1, element.compareTo(new Element(4, "yo")));
		assertEquals(1, element.compareTo(new Element(5, "yo")));
		assertEquals(-1, element.compareTo(new Element(6, "yo")));
	}

	public void testToString() {
		element = new Element(5, "hi");
		assertEquals(element.toString(), "5: hi");
	}

}
