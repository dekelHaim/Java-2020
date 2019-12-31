
public class App {
	
	
	
	public static void tryAccessArray(String[] arr,int index){
		
		System.out.println("start tryAccessArray "+index);
			 
		System.out.println(arr[index]);
		
		System.out.println("After tryAccessArray "+index);

	}
	
	
	public static void main(String[] args) {
		
		
		String[] array=new String[]{"A1","B2"};
		
			
		System.out.println("----------------tryAccessArray(array,1)---------------------");
        tryAccessArray(array,1);
	
		
		System.out.println("----------------tryAccessArray(array,3)---------------------");
		tryAccessArray(array,3);
		
		
		System.out.println("----------------tryAccessArray(array,0)---------------------");
		tryAccessArray(array,0);


	}
}
