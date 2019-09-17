package pucrs.qp.exercicio;

import static org.junit.Assert.*;

import org.junit.Test;
import pucrs.qp.exercicio.*;


public class LinkedListTest {

	@Test
	public void testAddNodeInLast() {
		LinkedList list = new LinkedList();
		Node subnodo = new Node("subNode", null);
		Node nodo = new Node("Teste", subnodo);
		list.addNodeInLast(nodo);
		list.addNodeInLast(subnodo);
		assertEquals(list.tail, subnodo);
	}
	
	@Test
	public void testTraverseLenghtZero() {
		LinkedList list = new LinkedList();
		assertEquals(list.traverse(), 0);
	}
	
	@Test
	public void testTraverseSize() {
		LinkedList list = new LinkedList();
		Node nodo = new Node("Teste", null);
		list.addNodeInLast(nodo);
		assertEquals(list.traverse(), null);
	}

}
