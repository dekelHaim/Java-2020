
public class App {

	public static void main(String[] args) {
		
		
		// access static variables is trough the class name
		System.out.println(Pizza.sumOfToppings);  //--> 0
				
		Pizza pizza1=new Pizza(2);
		Pizza pizza2=new Pizza(3);
		
		// access non-static variables is trough the object
		System.out.println(pizza1.numOfToppings);  //--> 2
		System.out.println(pizza2.numOfToppings);  //--> 3
		
		// access static variables is trough the class name
		System.out.println(Pizza.sumOfToppings);  //--> 5
		
		
		System.out.println(pizza1);  //--> Pizza@2a139a55 NumOfToppings: 2
		System.out.println(pizza2);  //--> Pizza@15db9742 NumOfToppings: 3
				
	}

}
