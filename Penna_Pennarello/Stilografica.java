package newEsercizi;


public class Stilografica extends Penna implements Ricaricabile {

	public Stilografica() {
		super();
	}

	public Stilografica(int i) {
		super(i);
	}
	
	public void ricarica(int i) {
		inch = i >= maxInch ? maxInch : i;
	}
	
	public void scrivi(String s) {
		s = s.replaceAll("[#?!:;,.]", "");
		super.scrivi(s);
	}


}
