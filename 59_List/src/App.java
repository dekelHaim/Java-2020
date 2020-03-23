import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		ArrayList<String> cart=new ArrayList<String>();
		
		System.out.println(cart.size());  //--> 0
		
		cart.add("Bread");
		cart.add("Milk");
		cart.add("Bread");
		
		System.out.println(cart.size());  //--> 3

		System.out.println(cart.get(1));  //--> Milk
		
		cart.add("Coffee");

		
		for(int i=0;i< cart.size(); System.out.print(cart.get(i++) + " "));
		System.out.println();
		
		for(String s:cart) {
			System.out.print(s+ " ");
		}
		System.out.println();
		
		ArrayList<String> junk=new ArrayList<String>();
		junk.add("Milka");
		junk.add("Kinder");
		
		cart.addAll(junk);
		System.out.println(cart);  //--> [Bread, Milk, Bread, Coffee, Milka, Kinder]
		
		
		//-------remove by index (returns the content of the removed item)-------
		String removed=cart.remove(3); 
		System.out.println(removed); //--> Coffee
		System.out.println(cart);  //--> [Bread, Milk, Bread, Milka, Kinder]
		
		
		//-------remove by content (returns if this content was found and removed)-------
		//-------removes the first matching item-------
		boolean res=cart.remove("Milka");
		System.out.println(res); //--> true
		System.out.println(cart); //--> [Bread, Milk, Bread, Kinder]
	
		

		for(boolean currentRes=true;currentRes;currentRes=cart.remove("Bread"));
		System.out.println(cart); //--> [Milk, Kinder]
		
		
		cart.set(0, "Water");
		System.out.println(cart); //--> [Water, Kinder]
		
		cart.set(1, "Banana");
		System.out.println(cart); //--> [Water, Banana]
		
		cart.addAll(1, junk);
		System.out.println(cart); //--> [Water, Milka, Kinder,Banana]
		

		cart.add(0, "Kinder");
		System.out.println(cart); //--> [Kinder,Water, Milka, Kinder,Banana]
		
		System.out.println(cart.contains("apple"));  //--> false
		System.out.println(cart.contains("Banana"));  //--> true	
		
		
		System.out.println(cart.indexOf("Kinder"));  //--> 0
		System.out.println(cart.lastIndexOf("Kinder"));  //--> 3
		
		
		System.out.println(cart); //--> [Kinder, Water, Milka, Kinder, Banana]
		System.out.println(junk); //--> [Milka, Kinder]
		cart.removeAll(junk);
		System.out.println(cart); //--> [Water, Banana]
		
		
		
	 	Object[] cartArr1=cart.toArray();
		for(int i=0;i< cartArr1.length; System.out.print(cartArr1[i++] + " "));
		System.out.println();  //--> Water Banana 
		
	}

}
