package newEsercizi;

public class Penna {
	
	protected int inch;
	protected int maxInch= 10000;
	
	public Penna() {
		inch = 0;
	}
	
	public Penna(int i) {
		inch = i >= maxInch ? maxInch : i;
	}
	
	public void scrivi(String s) {
		System.out.println(s);
		s = s.replace(" ", "");
		inch = (inch - s.length()) < 0 ? 0 : inch - s.length();
	}
	
	public String toString() {
		String s = "Inchiostro: " + Integer.toString(inch) + "\n";
		return s;
	}
	
}
