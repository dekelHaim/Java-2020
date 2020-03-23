
public class Person implements IPrint<Integer>{

	@Override
	public void print(Integer val) {
		System.out.println("Youre age is: "+val);	
	}
}
