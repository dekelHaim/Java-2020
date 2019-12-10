
public class App {

	public static void main(String[] args) {
		System.out.println("Craeting a new Animal:");
		Animal a=new Animal();
		
		System.out.println("Craeting a new Dog:");
		Dog d=new Dog();
		
		System.out.println("Craeting a new person:");
		Person p=new Person("Bob");
		
		
		System.out.println("Craeting a new student:");
		Student s=new Student();
		
	}

}

/*
 OUTPUT:
 ______________________
	Craeting a new Animal:
	Craeting a new Dog:
	Craeting a new person:
	Person ctor created: Bob
	Craeting a new student:
	Person ctor created: Alice
	Student ctor
 */
