package Animals;

public class Cat {
	
	public Cat() {
		this(22);
		System.out.println("BEGIN - ctor without param");
		
	}
	
	public Cat(int a) {
		System.out.println("BEGIN - ctor with param");
		setAge(a);
	}

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = (age>0 && age<120)?age:99;
	}
}
