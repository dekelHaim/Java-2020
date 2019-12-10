
public class Student extends Person{
	/*
	 Explicitly super constructor "Person()" is defined,
	 Must not explicitly invoke in Student class a "super()"
	 call to Person constructor - 
	 Because we do not pass parameters ,So an implicit
	 "super()" call is invoked
	 */
	public Student() {
		System.out.println("Student ctor");
	}
}
