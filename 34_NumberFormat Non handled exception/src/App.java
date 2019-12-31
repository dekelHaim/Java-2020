
public class App {
	
	
	
	public static void tryParseInt(String str){
	
			 System.out.println("start try to parse "+str+" to int");
			 
			 int n1=Integer.parseInt(str);
			 
			 System.out.println("end try to parse "+n1+" to int");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("----------------tryParseInt(\"3\")---------------------");
		tryParseInt("3");
		
		System.out.println("----------------tryParseInt(\"hello\")---------------------");
		tryParseInt("hello");
		
		System.out.println("----------------tryParseInt(\"5\")---------------------");
		tryParseInt("5");
		
	   
	}
}
