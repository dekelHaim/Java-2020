package Test;

public class Person {
	
	// can access private - only from inside this class
	private int age=5;
	private String name="Bob";
	
	// can access public - from everywhere 
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// can access protected 
	// only from inside this class or subclasses
	// or other classes in this package
	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}
}
