
public class Chips extends VegFood{

	public boolean isExtraLarge=true;
	
	@Override
	public void setPrice(double price) {
		price=(price>10)?price:10;		
	}

	@Override
	public void keepFood() {
		System.out.println("Keep me warm");	
	}
	
	public String getDescription() {
		return "Chips class";
	}

}
