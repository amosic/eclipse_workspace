package newEsercizi;

public class Pennarello extends Penna implements Ricaricabile {

	public Pennarello() {
		super();
	}
	
	public Pennarello(int i) {
		super(i);
	}

	public void ricarica(int i) {
		inch = i >= maxInch ? maxInch : i;
	}
	
	public void scrivi(String s) {
		System.out.println(s);
		s = s.replace(" ", "");
		inch = inch - 2*s.length() < 0 ? 0 : inch - 2*s.length();
	}
	
	
}
