public class Pizza {
	
	    //Each instance contains a different int
	 	public int numOfToppings;
	  
	 	//Class level 
	 	public static int sumOfToppings=0;
	 	
	 	public Pizza(int numOfToppings){
	 		this.numOfToppings=numOfToppings;
	 		Pizza.sumOfToppings+=numOfToppings; 		
	 	}
	 	
	 	//Every class in java inherits from "Object class"
	 	//And "Object class" contains a function named "toString"
	 	//By default "toString" returns the address of the object
		@Override 
		public String toString() {
			return super.toString()+"\nNumOfToppings: "+numOfToppings;
		}
}
