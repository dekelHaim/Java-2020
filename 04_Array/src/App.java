
public class App {

	public static void main(String[] args) {
		
		//first way to init an array
		int[] arr1=new int[2];
		
		
		//second way to init an array
		int[] arr2=new int[] {2,4,6};

		for(int e:arr2) {
			e=9;
		}
		
		for(int i=0; i<arr2.length;i++) {
			System.out.println("simple for: index = "+i + 
					           " contains= "+arr2[i]);
		}
		
		
		
	}

}
