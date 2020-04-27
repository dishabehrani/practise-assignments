package com.psl.methods;

public class Student {

	
	
	private String name;
	
	private double weight;

	public double getWeight() {  //double as retrun type
		return weight; 
	}

	public void setWeight(double weight) {  
		this.weight = weight;
		return; 		//we can use return but w/o any value even if the RT-void just to make an explicit exit from the method
	}

	public String getName() {
		return name;   //explicitly return followed by a value 
	}

	public void setName(String name) { //return type is void  return is optional
		//return; 	//CE->code after return becomes unreachable always be the last stmt to execute in  a method
		this.name = name;
	}

	//creates an  array internally
	//days is  a method 'PARAMETER'
	//... called as ellipsis
	public void daysOff(int ... days){
		
		int daysoff=0;
		
		for(int i=0;i<days.length;i++)
		{
			daysoff+=days[i];
		}
		
		System.out.println(daysoff);
	}
	
	
	
	//	public void daysOff1(int days,months,year){} //CE->you must specify type of each parameter
		
		
	//public void daysOff1(int ... days,int year){} //CE-> var-args should be the last parameter of method
	//	public void daysOff1(int ... days,String ... months){}//CE->only one var-arg  parameter is allowed for a method 
		
			
		
	
	public static void main(String[] args) {
	
		
		Student s1=new Student();
		
		
		//double w1=s1.setWeight(100.4); //CE->cannot convert from void to double
		
		
		//int w1=s1.getWeight();  //cannot convert from double to int
		
		
		//solution you can typecast but only to compatible types
		int w1=(int)s1.getWeight();  //you can just store the value w/o using it no CE
		
		//but not into types that are non compatible
		//boolean value=s1.getWeight();
		s1.daysOff(1,2,3,4); //these are method 'ARGUMENTS'
		
		System.out.println("end of file");
		
	}
	
		
}
