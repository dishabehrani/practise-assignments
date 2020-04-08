package com.psl.concat;


public class Example1 {

	
	public static void main(String[] args) {
		
		int i1=10;
		int i2=20;
		String str1="disha";
		
		//add
		System.out.println(i1+i2+str1);
		System.out.println((i1+i2)+str1);
	
	
		//treat as number
		System.out.println(" "+i1+i2+str1);
		
		
		
		String str2="behrani";
	//	String str3;
		str1+=str2;
		//str3+=str1+str2; //CE str3 should be initialized first
		
		System.out.println(str1);
	
		//System.out.println(str3);
	}
	
	
}
