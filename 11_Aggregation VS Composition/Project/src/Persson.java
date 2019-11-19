
public class Persson {
	private Address myAddress;
	private Passport myPassport;
	
	public Persson(Address myAddress, Passport myPassport) {
		setMyAddress(myAddress);
		this.myPassport = myPassport;
	}
	
	public Address getMyAddress() {
		return myAddress;
	}
	public void setMyAddress(Address myAddress) {
		this.myAddress = myAddress;
	}
	public Passport getMyPassport() {
		return myPassport;
	}
}
