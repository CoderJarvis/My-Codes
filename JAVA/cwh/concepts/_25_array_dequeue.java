package _01_PracticeConcept;

import java.util.ArrayDeque;

public class _25_array_dequeue {

	public static void main(String[] args) {
		
		
		ArrayDeque<Integer> arr=new ArrayDeque<>();
		arr.add(10);
		arr.add(30);
		arr.add(10);
		arr.add(60);
		arr.add(90);
		System.out.println(arr);
		arr.offerFirst(12);
		System.out.println(arr);
		arr.pollFirst();
		System.out.println(arr);
		arr.addLast(100);
		System.out.println(arr);
		arr.removeLast();
		System.out.println(arr);
		arr.removeFirst();
		System.out.println(arr);
		
		

		
		
		

	}

}
