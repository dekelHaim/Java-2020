
public class App {

	public static <T extends Food> void showInfo(T obj) {
		System.out.println(obj.price);
	}
	
	public static <T extends IDrinkable> void showDrinkInfo(T obj) {
		System.out.println(obj);
	}

	public static <T extends Food & IDrinkable<T>> void showFoodDrinkInfo(T obj) {
		System.out.println(obj);
	}


	public static void main(String[] args) {
		//showInfo(3);  //COMPILATION ERROR (Integer does not inherit from Food)
		showInfo(new Pizza());  //(Pizza not inherit from Food)
		
		showDrinkInfo(new VegShake());
		showDrinkInfo(new FruitShake());
		
		showFoodDrinkInfo(new FruitShake());
	}

}
