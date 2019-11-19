import Animals.*;

public class App {

	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s.myCat);
		s.myCat=new Cat();
		System.out.println(s.myCat.getAge());
	}

}
