package com.Practice_03_Strings;

public class _02_replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="Saswat Kumar Panda";
		System.out.println(st);
		String s2=st.replace(" ","_");
		System.out.println(s2);	//reference 's2' references toa new string
		System.out.println(st); //original value not affected because strings are immutable
	}

}
