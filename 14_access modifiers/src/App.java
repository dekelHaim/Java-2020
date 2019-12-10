public class App {

	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s.getStudentInfo());
		
		System.out.println(s.getAge());
	
		
		// System.out.println(s.getName());  // --> COMPILATION ERROR: The method getName() from the type Person is not visible
		
	}

}

/*
 OUTPUT:
 ______________________
 Student age: 5 ,name:Bob
 5
  
 */
