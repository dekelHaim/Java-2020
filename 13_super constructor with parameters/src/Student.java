
public class Student extends Person{
	
	/*
	 Implicit super constructor Person() is undefined,
	 Must explicitly invoke in Student class a "super()"
	 call to Person constructor - with a parameter
	 */
	public Student() {
		super("Alice");
		System.out.println("Student ctor");
	}
}
