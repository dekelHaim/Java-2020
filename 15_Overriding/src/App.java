
public class App {

	public static void main(String[] args) {
		
		Animal a=new Animal();
		a.getAnimalInfo();  //--> I am an animal
		a.sayHello();  //--> Hello animal
		a.sayBye();  //--> Bye animal
		
		
		Pet p=new Pet();
		p.getAnimalInfo();  //--> I am an animal
		p.sayHello();  //--> Hello pet
		p.sayBye();  //--> Bye pet
		
		
		Cat c=new Cat();
		c.getAnimalInfo();  //--> I am an animal
		c.sayHello();  //--> Hello pet
		c.sayBye();  //--> Bye cat


	}

}
