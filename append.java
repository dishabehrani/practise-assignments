package com.psl.append;

public class Example1 {
	public static void main(String[] args) {
		
		String sb3="disha7";

		StringBuffer sb5=new StringBuffer();
		
		StringBuffer sb4=new StringBuffer();
		StringBuffer sb1=new StringBuffer();
		StringBuffer sb2=new StringBuffer(" pqr");
		//primitive,string,stringBuilder,object, char array 
		sb1.append(1);
		sb1.append(1.0);
		sb1.append(true);
		sb1.append("disha");
		char [] arr=new char []{'b','e','h','r','a','n','i'};
		
		sb1.append(arr);
		sb1.append(new  Student ("abc"));
		sb1.append(sb2);
		sb1.append('s');
		
		System.out.println(sb1);
		//11.0truedishabehranicom.psl.append.Student@1db9742 pqr
		//if we dont ovveride toString();
		
		
		
		//for char array includes 1 and 3
		sb4.append(arr,1,3);
		System.out.println(sb4);
		
		
		//for String includes 1 and 2 only 
		sb5.append(sb3,1,3);
		System.out.println(sb5);
	}

}
class Student{
	
	String name;
	Student(String name){
		
		this.name=name;
	}
	@Override
	public String toString() {
		return name;
	}
}