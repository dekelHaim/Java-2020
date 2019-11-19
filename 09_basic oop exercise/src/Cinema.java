
public class Cinema {
	
	public Cinema(String cinemaName, int chairsAmount, int openHour, int closeHour) {
		setCinemaName(cinemaName);
		setChairsAmount(chairsAmount); 
		setOpenHour(openHour); 
		setCloseHour(closeHour); 
	}
	
	private String cinemaName;
	private int chairsAmount;		//מספר חיובי בלבד
	private int openHour;			//מספר שלם חיובי בלבד, בטווח  6-12
	private int closeHour;			//מספר שלם חיובי בלבד, בטווח  18-23

	
	public int getOpenHours() {
		return closeHour-openHour;
	}
	
	public void printCinemaInfo() {
		System.out.println(cinemaName+" is open from:"+
							openHour + " to "+closeHour+ 
							" (total: "+getOpenHours() + "), and has " 
							+ chairsAmount + " chairs");
	}
	
	public String getCinemaName() {
		return cinemaName;
	}
	
	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}
	
	public int getChairsAmount() {
		return chairsAmount;
	}
	public void setChairsAmount(int chairsAmount) {
		this.chairsAmount = (chairsAmount>0)?chairsAmount:1;
	}
	public int getOpenHour() {
		return openHour;
	}
	public void setOpenHour(int openHour) {
		this.openHour =(openHour>=6 && openHour<=12)?openHour:6;
	}
	public int getCloseHour() {
		return closeHour;
	}
	public void setCloseHour(int closeHour) {
		this.closeHour = (closeHour>=18 && closeHour<=23)?closeHour:18;
	}
	
}

