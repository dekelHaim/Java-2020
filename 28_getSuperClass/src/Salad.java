
public class Salad extends VegFood{

	public String topping="Olive oil";
	
	@Override
	public void setPrice(double price) {
		price=(price>30)?price:30;		
	}

	@Override
	public void keepFood() {
		System.out.println("Keep in low temp");	
	}

}
