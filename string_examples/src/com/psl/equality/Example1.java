package com.psl.equality;

public class Example1 {

	
	public static void main(String[] args) {
		
	//DOUBLE QUOTES
	
	String s1="disha";
	String s2="disha";
	
	
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	System.out.println(s1!=s2);
	
	
	
	//NEW OPERTAOR
	String s3=new String ("ABC");
	String s4=new String ("ABC");
	
	System.out.println(s3==s4);
	System.out.println(s3.equals(s4));
	System.out.println(s3!=s4);
	
	
	System.out.println(s1.substring(0,1).equals(s2.substring(0,1)));
	
	//substring method returns a new string object
	System.out.println(s1.substring(0,1)==(s2.substring(0,1)));
	}
	
}
