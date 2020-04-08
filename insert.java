package com.psl.insert;

public class Example1 {

	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("Hello");
		StringBuilder sb2=new StringBuilder("Hello");
		char []ar=new char[]{'h','o','l','a'};

		StringBuilder sb3=new StringBuilder("Disha");
		

		StringBuilder sb4=new StringBuilder("0123456");
		sb1.insert(1,'o');
		System.out.println(sb1);
		
		
	
		
		sb2.insert(0,ar,1,3);
		System.out.println(sb2);
		
		//4 position exculded
		sb1.delete(2, 4);
		System.out.println(sb1);
	
		//specifiy
		sb1.deleteCharAt(2);
		System.out.println(sb1);
		
	//	sb1.trim();//CE-doest exist for String Builder
		
		
		
	System.out.println(sb1.reverse());
	
	//4 excluded
	sb3.replace(2, 4, "ABC");
	System.out.println(sb3);
	
	//4 excluded returns charSequence
	System.out.println(sb4.subSequence(2, 3));
	//System.out.println(sb4.subSequence(2, 2)); //blank
	//doesn't modify 
	System.out.println(sb4);
	
	
	
	
	
	
	}
}
