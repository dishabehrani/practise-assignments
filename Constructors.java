package constructor;

public class Constructors {
	
	
	
	
	String name;
	int age;
	//exectued before constructor,called before each constuctor call
	{
		
		System.out.println("inside instance block 1");
	}
	//if no constructor in the class complier creates a default constructor
	
	//not a constructor but a method , needs explicit calling,doesnt throw any error but not enouraged
	void Constructors(){
		System.out.println("its not  a constructor but a method");
	}
	
	//no -arg,no return type not even void
	//if we dont put super(); it explicitly puts it
	//cant overload just by changing the access modifiers-public default,protected,private
	Constructors(){
		
		
		this("abc"); //call constructor with name arg
		//this("abc",10); // cant call multipple constructor  from same class
//		//Constructors("abc"); //cant invoke constructor as same name of class
		
		System.out.println("inside constructor");
//		//this("abc"); //CE->must be first line of constructor
		
	}
	
	
	
	
	//CE->Recursive constructor invocation
	/*Constructors(){
		this();
	}
	*/
	
	
	//CE->Recursive constructor invocation
/*	
	Constructors(){
		this("disha");
	}
	Constructors(String name){
		this();
	}
	*/
	{
		
		System.out.println("inside instance block 2");
	}
	
	/* duplicate  no -arg constructor
	Constructors()
	{
		
	}
	*/
	
	
	Constructors(String name)
	{
		this.name=name;
		
	}
	
	//now we have a constructor so compiler doesn't provide a default one
	Constructors(String name,int age)
	{
		this.name=name;
		this .age=age;
		
	}
	
	
	public static void main(String[] args) {
		Constructors c1=new Constructors(); //no-arg called ,gives error if no -arg is not found
		c1.Constructors();
		Constructors c2=new Constructors("disha"); //only name constructor called
		System.out.println("default of instance="+c2.age);
		System.out.println("actual name passed="+c2.name);
		

		Constructors c3=new Constructors("disha",22); //name with age constructor called
		System.out.println("actual age="+c3.age);
		System.out.println("actual name passed="+c3.name);
	
	}
}
