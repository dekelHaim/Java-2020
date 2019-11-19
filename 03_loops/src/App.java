
public class App {

	public static void main(String[] args) {
		
		//---------------while--------------
		int index1=1;
		while(index1<3) {
			System.out.println("While: "+index1);
			index1++;
		}
		
		//---------------do while------------
		int index2=1;
		do {
			System.out.println("Do-While: "+index2);
			index2++;
		}while(index2<3);
		
		//---------------for------------------
		for(int index3=1;index3<3;index3++) {
			System.out.println("for: "+index3);
		}
		
		//-------------empty-for---------------
				for(int index3=1;
						index3<3;
						System.out.println("empty for: "+(index3++)));
	}

}
