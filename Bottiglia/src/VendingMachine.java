import java.util.ArrayList;

public class VendingMachine {
		private ArrayList<Bottle> bottles;
	
	public VendingMachine(){
		Bottle bottle = new Bottle ("aqua", 500);
		Bottle bottle1 = new Bottle ("aqua", 500);
		Bottle bottle2 = new Bottle ("aqua", 500);
		Bottle bottle3 = new Bottle ("cocacola", 355);
		Bottle bottle4 = new Bottle ("fanta", 355);
		bottles = new ArrayList<Bottle>();
		bottles.add(bottle);
		bottles.add(bottle1);
		bottles.add(bottle2);
		bottles.add(bottle3);
		bottles.add(bottle4);
		
	}

	public Bottle getBottle(int i) {	
		return bottles.get(i);
	}
}
	



