
public class Meal {
	
	
	// Core
	
	private int batonchik;
	private int planktonchik;
	private int melon;
	private int chips;
	
	private int batonchik1;
	private int planktonchik1;
	private int melon1;
	private int chips1;
	
	
	// Getters&Setters
	
	public int getBatonchik() {
		return batonchik;
	}
	
	public void setBatonchik(int batonchik) {
		this.batonchik = batonchik;
	}
	
	public int getPlanktonchik() {
		return planktonchik;
	}
	
	public void setPlanktonchik(int planktonchik) {
		this.planktonchik = planktonchik;
	}
	
	public int getMelon() {
		return melon;
	}
	
	public void setMelon(int melon) {
		this.melon = melon;
	}
	
	public int getChips() {
		return chips;
	}
	
	public void setChips(int chips) {
		this.chips = chips;
	}
	
	// Constructor
	
	Meal() {
		setBatonchik(2);
		setPlanktonchik(2);
		setMelon(2);
		setChips(2);
	}
	
	// Methods
	
	void batonchikIncrease(int i) {
		batonchik1 = getBatonchik() + i;
		if (batonchik1 >= 0) {
			setBatonchik(batonchik1);
		}
	}
	
	void planktonchikIncrease(int i) {
		planktonchik1 = getPlanktonchik() + i;
		if (batonchik1 >= 0) {
			setPlanktonchik(planktonchik1);;
		}		
	}
	
	void melonIncrease(int i) {
		melon1 = getMelon() + i;
		if (melon1 >= 0) {
			setMelon(melon1);
		}	
	}
	
	void chipsIncrease(int i) {
		chips1 = getChips() + i;
		if (chips1 >= 0) {
			setChips(chips1);;
		}			
	}
}
