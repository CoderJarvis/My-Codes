package _01_PracticeConcept;

import java.util.Vector;

public class _26_Vector {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		
		v.add(12);
		v.add(62);
		v.add(82);
		v.add(12);
		v.add(52);
		v.add(92);
		
		System.out.println(v);
		Vector<Integer> v2=new Vector<>();
		v2.add(4);
		v2.add(2);
		v2.add(8);
		v2.add(1);
		v2.add(5);
		v2.add(9);
		
		System.out.println(v2);
		
		System.out.println(v.size());
		
		v.addAll(v2);
		System.out.println(v);
		System.out.println(v.contains(100000));
		
	
	
	}

}
