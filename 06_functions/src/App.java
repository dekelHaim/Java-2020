
public class App {
	
	public static void sayHello() {
		System.out.println("sayHello");
	}
	
	
	public static String returnHello() {
		return "returnHello";
	}
	
	public static int add(int n1,int n2) {
		return n1+n2;
	}
	
	public static void main(String[] args) {
		sayHello();
		
		String s=returnHello();
		System.out.println(s);
		
		int i=add(2,4);
		System.out.println(i);
	}
}
