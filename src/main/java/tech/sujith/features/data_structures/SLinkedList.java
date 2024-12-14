package tech.sujith.features.data_structures;

import tech.sujith.features.dto.Node;

public class SLinkedList {
	private Node node;

	public void add(int value) {

		if (node == null) {
			node = new Node(value);
			return;
		}

		// Find last node
		Node last = node;

		while (last.getNext() != null) {
			last = last.getNext();
		}

		Node newNode = new Node(value);
		last.setNext(newNode);

	}

	public void addSort(int value) {

		// For the first element insertion
		if (node == null) {
			node = new Node(value);
			node.setValue(value);
			return;
		}

		// Find last node
		Node last = node;
		Node prev = null;
		
		
		while (last != null) {
			
			if(last.getValue() > value) {
				
				
				Node newNode = new Node(value);
				
				if(prev == null) { // Inserting the first element
					newNode.setNext(last);
					node = newNode;
				}else { // Inserting middle
					prev.setNext(newNode);
					newNode.setNext(last);
				}
				
				
				return;
			}
			
			prev = last;
			last = last.getNext();
		}
		
		// If given value is the greatest
		Node newNode = new Node(value);
		prev.setNext(newNode);

		
		
		

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		Node temp = node;
		while (temp != null) {
			sb.append(temp.getValue() + " ");
			temp = temp.getNext();
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		SLinkedList l = new SLinkedList();
		l.addSort(7);
		l.addSort(12);
		l.addSort(100);
		l.addSort(1);
		l.addSort(6);
		l.addSort(50);
		l.addSort(19);
		System.out.println(l);

	}
}
