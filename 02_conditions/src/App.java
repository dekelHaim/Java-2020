
public class App {

	public static void main(String[] args) {
		
		boolean b=true;
		/*
		 
		  true && true		==> true
		  true && false		==> false
		  false && true		==> false
		  false && false	==> false
		  
		  _______________________________
		  
		  true || true		==> true
		  true || false		==> true
		  false || true		==> true
		  false || false	==> false		  
		  _______________________________
		  
		  !true				==> false
		  !false			==> true
		 */
		if(true) 
			if(false)
				System.out.println("inner cond is true");
		else {
			System.out.println("Cond is false");
		}
		else {
			System.out.println("Cond is false");
		}

	}

}
