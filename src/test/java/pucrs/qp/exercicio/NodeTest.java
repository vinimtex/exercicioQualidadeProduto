package pucrs.qp.exercicio;

import static org.junit.Assert.*;

import org.junit.Test;
import pucrs.qp.*;

public class NodeTest {

	@Test
	public void testNextIsNull() {;
		Node nodo = new Node("Teste", null);
		assertEquals(nodo.getNext(), null);
	}
	
	@Test
	public void testNextIsNotNull() {
		Node subNode = new Node("Outro nodo", null);
		Node nodo = new Node("Teste", subNode);
		assertEquals(nodo.getNext(), subNode);
	}
	
	@Test
	public void testNodeData() {
		Node nodo = new Node("Outro nodo", null);
		assertEquals(nodo.getData(), "Outro nodo");
	}
	
	@Test
	public void testNodeDataSetData() {
		Node nodo = new Node(null, null);
		nodo.setData("Teste");
		assertEquals(nodo.getData(), "Teste");
	}
	
}
