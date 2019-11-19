
public class App {

	public static void main(String[] args) {
		Persson p1=new Persson(new Address("TLV"),new Passport("000"));
		
		Persson p2=new Persson(new Address("LONDON"),new Passport("999"));

		System.out.println("p1: "+p1.getMyPassport() + " "+ p1.getMyAddress());
		System.out.println("p2: "+p2.getMyPassport() + " "+ p2.getMyAddress());
		
		Address bestAddress=new Address("Ariel");
		p1.setMyAddress(bestAddress);
		p2.setMyAddress(bestAddress);
		
		System.out.println("p1: "+p1.getMyPassport() + " "+ p1.getMyAddress());
		System.out.println("p2: "+p2.getMyPassport() + " "+ p2.getMyAddress());
		
	}

}


/*
OUTPUT:
___________________

p1: Passport@76ed5528 Address@2c7b84de
p2: Passport@3fee733d Address@5acf9800
p1: Passport@76ed5528 Address@4617c264
p2: Passport@3fee733d Address@4617c264

*/
