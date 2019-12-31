
public class App {

	public static void main(String[] args) {
		//----------------WAY 1----------------
		Class c= NumberFormatException.class;
		System.out.println(c.getSuperclass().getName());  //--> java.lang.IllegalArgumentException
		
		c=IllegalArgumentException.class;
		System.out.println(c.getSuperclass().getName());  //--> java.lang.RuntimeException
				
		c=RuntimeException.class;
		System.out.println(c.getSuperclass().getName());  //--> java.lang.Exception
		
		//----------------WAY 2----------------
		System.out.println((new NumberFormatException()) instanceof Exception);  //--> true

	}

}
