
public class App {

	public static void printInheritInfo(Class currentClass) {
		while(!currentClass.getName().equals("java.lang.Object")){
			System.out.println(currentClass.getName());
			currentClass=currentClass.getSuperclass();
		}
		System.out.println(currentClass.getName());
	}
	public static void main(String[] args) {
		
		System.out.println("------Object info------");
		printInheritInfo(Object.class);
		
		System.out.println("------String info------");
		printInheritInfo(String.class);
		
		
		System.out.println("------Food info------");
		printInheritInfo(Food.class);

		System.out.println("------VegFood info------");
		printInheritInfo(VegFood.class);
		
		System.out.println("------Chips info------");
		printInheritInfo(Chips.class);
		
		System.out.println("------Salad info------");
		Salad s=new Salad();
		printInheritInfo(s.getClass());
	}

}


/*
 OUTPUT:
 ________________________
 ------Object info------
java.lang.Object
------String info------
java.lang.String
java.lang.Object
------Food info------
Food
java.lang.Object
------VegFood info------
VegFood
Food
java.lang.Object
------Chips info------
Chips
VegFood
Food
java.lang.Object
------Salad info------
Salad
VegFood
Food
java.lang.Object 

*/
 */