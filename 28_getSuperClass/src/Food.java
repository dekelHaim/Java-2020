abstract public class Food {
	
	private double weight;
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	protected double price;
	public abstract double getPrice();
	public abstract void setPrice(double price);
	
	public abstract void keepFood();
	
	public String getDescription() {
		return "Food class";
	}
}
