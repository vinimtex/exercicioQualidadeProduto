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

}
