
public class Person {
	public String name;
	
	/*
	 Implicit super constructor Person() is undefined,
	 Because we explicitly created a constructor Person(String name)
	*/
	public Person(String name) {
		this.name=name;
		System.out.println("Person ctor created: "+this.name);
	}
	
}
