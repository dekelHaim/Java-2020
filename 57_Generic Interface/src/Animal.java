
public class Animal implements IPrint<String>{

	@Override
	public void print(String val) {
		System.out.println("Your name is: "+val);
		
	}

}
