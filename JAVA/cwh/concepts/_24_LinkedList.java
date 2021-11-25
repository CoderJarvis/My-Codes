package _01_PracticeConcept;

import java.util.LinkedList;

public class _24_LinkedList {

	public static void main(String[] args) {
		
		
		LinkedList <Integer> ll =new LinkedList<>();
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		
		System.out.println(ll);
		System.out.println(ll.get(2));
		ll.addLast(44);
		System.out.println(ll);
		ll.addFirst(5);
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.peek());
		System.out.println(ll.peekLast());
		System.out.println(ll);
		ll.pop();
		System.out.println(ll);
		ll.remove();
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		ll.add(55);
		ll.add(56);
		ll.add(67);
		System.out.println(ll);
		ll.element();
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
