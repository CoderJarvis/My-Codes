package _01_PracticeConcept;

import java.util.Stack;

public class _27_Stack_ {
	public static void main(String[] args) {
		
		Stack <Integer> st=new Stack<>();
		st.add(23);
		st.add(34);
		st.add(84);
		st.add(44);
		st.add(74);
		st.push(67);
		st.pop();
		st.peek();
		System.out.println(st);
		System.out.println(st.search(23));
		st.push(77);
		System.out.println(st);
		System.out.println(st.size());
		System.out.println(st.lastElement());		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
