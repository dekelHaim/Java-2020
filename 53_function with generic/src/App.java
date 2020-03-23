
public class App{

	public static <T> boolean compareObjects(T n1, T n2) {
		return n1==n2;
	}

	public static void main(String[] args) {		
		System.out.println(compareObjects("a","s"));
		System.out.println(compareObjects('a','a'));
		System.out.println(compareObjects(1,5));
		System.out.println(compareObjects(1.3,5.6));
		System.out.println(compareObjects(true,false));
	}

}
