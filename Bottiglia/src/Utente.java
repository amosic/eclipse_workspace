import java.util.ArrayList;

public class Utente {
public ArrayList<Bottle> bottleBought;

	
	public Utente() {
	ArrayList<Bottle> bottleBought;
		this.bottleBought = new ArrayList<Bottle>();
	}
	
	public void getBottle(Bottle bottle) {
		bottleBought.add(bottle);
	}

	
}


