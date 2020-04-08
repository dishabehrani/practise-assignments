package com.psl.methods;

public class Example1 {
	
	
	public static void main(String[] args) {
	
		
		String str2="       corona         ";

		String str1="corona";
		
		//only int argument
		System.out.println("0="+str1.charAt(0));
	  //System.out.println(str1.charAt(6));//StringIndexOutOfBoundsException
		System.out.println(str1.charAt(2));
		
		//both char and string argument
		System.out.println(str1.indexOf('o'));
		System.out.println(str1.indexOf('o',3));
		System.out.println(str1.indexOf('w'));
		System.out.println(str1.indexOf("ro"));
		
		//only int 
		System.out.println(str1.substring(2));
	  //System.out.println(str1.substring(2.0));//CE->only int no double
		System.out.println(str1.substring(2,5));
		System.out.println(str1.substring(2,6));
	  //System.out.println(str1.substring(2,7));//StringIndexOutOfBoundsException
	
		System.out.println(":"+str2+":");
		System.out.println(":"+str2.trim()+":");
		
		
		System.out.println(str1.length());
		
		//every time a new object is returned by methods, original string remains unmodified
		System.out.println(str1);
		
		
		//valid combination
		//char by char
		//string by string
		System.out.println("replaced by char ="+str1.replace('o', 'b'));
		System.out.println("replaced by string1 ="+str1.replace("o", "b"));
		System.out.println("replaced by string2 ="+str1.replace("or", "b"));
		System.out.println("replaced by string3 ="+str1.replace("oy", "b"));
		
		//CE:( type is not applicable for arguments)
		//cannot replace char by string 
		//System.out.println("char  replaced by string ="+str1.replace('o', "b"));
		
		//cannot replace string by char
		//System.out.println("char  replaced by string ="+str1.replace("o", 'b'));
		
		
		
		//System.out.println(str1.startsWith('c')); //accepts only string argument
		
		
		//matches the prefix string only
		System.out.println(str1.startsWith("co"));
		System.out.println(str1.startsWith("Co"));
		System.out.println(str1.startsWith("c"));
		
		
		
		//matches the suffix string only
		
		char [] aar1=new char[]{'a'};
		String end1=new String(aar1);
		String end=new String("a");
 		System.out.println(str1.endsWith("A"));
		System.out.println(str1.endsWith(end));
		System.out.println(str1.endsWith(end1));
		System.out.println(str1.endsWith("na"));
		

		String a="ABCAB   ";
		char b=a.replace('A','Z').charAt(0);
		System.out.println("a is="+b);
		
		
		a.substring(0,3).trim();
		System.out.println("not replaced="+a);
	
		a=a.substring(0,3).trim();
		System.out.println("assigned="+a);
	}

}


