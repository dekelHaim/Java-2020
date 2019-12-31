
public class App {
	
	public static void tryAccessArray(String[] arr,int index){
		
		try {
			System.out.println("start tryAccessArray "+index);
				 
			String str=arr[index];
			int num=Integer.parseInt(str);
			
			System.out.println("After tryAccessArray "+num);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.getClass().getName());
		}
		
		System.out.println("After try or catch");

	}
	
	
	public static void main(String[] args) {
		
		
		String[] array=new String[]{"1","B2","3"};
		
			
		System.out.println("----------------tryAccessArray(array,1)---------------------");
        tryAccessArray(array,1);
	
		
		System.out.println("----------------tryAccessArray(array,3)---------------------");
		tryAccessArray(array,3);
		
		
		System.out.println("----------------tryAccessArray(array,0)---------------------");
		tryAccessArray(array,0);


	}
}
