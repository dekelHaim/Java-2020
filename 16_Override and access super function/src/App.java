
public class App {

	public static void main(String[] args) {
		Animal a=new Animal();
		System.out.println(a.sayBye());  //--> Bye animal
		
		
		Pet p=new Pet();
		System.out.println(p.sayBye());  //--> Bye animal Bye pet
		
		
		Cat c=new Cat();
		System.out.println(c.sayBye());  //-->  Bye animal Bye pet Bye cat

	}

}
