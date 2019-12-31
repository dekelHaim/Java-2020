public class App {

	//here the exception is not the basic class Exception
	public static void printAge(int age) throws Exception{
		
		if(age>120 || age<0)
			throw new Exception();
		
		
		System.out.println("my age is: "+age);
		
	}
	
	
	public static void main(String[] args) {
		
		
		int age1=130;
		
		
			try {
				printAge(age1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		
		

		int age2=20;
		
		try {
			printAge(age2);
		}
		catch(RuntimeException ex) {
			System.out.println("Your age is not in range : "+age2);
		}
		
	
		System.out.println("End of Main.");
	}

}
