
public class App {

	public static void main(String[] args) {
		
		Person p=new Person();
		p.print(120);

		Animal a=new Animal();
		a.print("Bob");
		
		
		Pizza pz=new Pizza();
		pz.print(60);
		
		
		IPrint<Integer> printInt;
		printInt=new Person();  //(Person implements IPrint<Integer>)
		printInt=new Pizza();   //(Pizza implements IPrint<Integer>)
		
		//printInt=new Animal(); // COMPILATION ERROR (Animal implements IPrint<String> and not IPrint<Integer>)
	}
}
