package _01_PracticeConcept;

import java.util.ArrayList;

public class _23_ArrayList_class {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(19);
		arr.add(29);
		arr.add(39);
		arr.add(55);
		arr.add(33);
		
		arr.add(2, 30);
		
		System.out.println(arr);
		
		System.out.println(arr.get(2));
		System.out.println(arr.getClass());
		System.out.println(arr.toString());
		System.out.println(arr.contains(55));
		System.out.println(arr.hashCode());
		System.out.println(arr.indexOf(55));
		System.out.println(arr.isEmpty());
		System.out.println(arr.lastIndexOf(30));
		System.out.println(arr.remove(2));
		System.out.println(arr);
		arr.set(2, 49);
		System.out.println(arr);
		System.out.println(arr.iterator());
		System.out.println(arr. size());
		arr.clear();
		System.out.println(arr);

	}

}
