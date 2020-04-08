package com.psl.assignment;

public class Example1 {
	static  String name;
	
	public static void main(String[] args) {
		String str1=new String("disha");
		String str2="disha";
		String str3 ="disha";
		String str4=new  String("disha");
		
	
//		System.out.println(str1==str2);
//		System.out.println(str1.equals(str2));	
//		
//		System.out.println(str3==str2);
//		System.out.println(str3.equals(str2));
//		
//		System.out.println(str1==str4);
//		System.out.println(str1.equals(str4));
		
//		System.out.println("disha"==str2);
//		
//		System.out.println("disha"==str1);
//		

		
		
		
		//string constructors
		String s1=new String("behrani");
		System.out.println("String="+s1);
		
		char [] arr=new char []{'d','i','s','h','a'};
		String s2 =new String(arr);
		System.out.println("char array="+s2);
		
		StringBuffer s3=new StringBuffer("abc");
		String s4=new String (s3);
		System.out.println("String buffer="+s4);
		
		StringBuilder s5=new StringBuilder("pqr");
		String s6=new String (s5);
		System.out.println("String builder="+s6);
		
		//null concept
		String empid=null;
		System.out.println("by defaut" +name);
		System.out.println(empid);
		
		System.out.println("abc"=="pqr");
		
	}
}
