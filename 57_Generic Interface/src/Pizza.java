
public class Pizza implements IPrint<Integer>{

	@Override
	public void print(Integer val) {
		System.out.println("Pizza price: "+val);	
	}
}
