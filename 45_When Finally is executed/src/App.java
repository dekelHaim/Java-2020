
public class App {

	public static int getNum(String s) {
		int num=0;
		try {
			num=Integer.parseInt(s);
			System.out.println("End of try: num is: "+num);
			return num;
		}
		catch(Exception ex) {
			System.out.println("End of catch: num is: "+num);
			return num;
		}
		finally {
			num++;
			System.out.println("IN FINALLY: num is: "+num);
		}		
		
	}
	public static void main(String[] args) {
		
		System.out.println("------------getNum(\"A\")--------------");
		int res1=getNum("A");
		System.out.println("res1 is: "+res1);
		
		System.out.println("------------getNum(\"9\")--------------");
		int res2=getNum("9");
		System.out.println("res2 is: "+res2);

	}

}
