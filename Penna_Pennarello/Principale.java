package newEsercizi;

public class Principale {

	public static void main(String[] args) {

		Penna biro = new Penna(500);
		Pennarello stilo = new Pennarello(500);
		Stilografica blanc = new Stilografica(500);
		
		biro.scrivi("    ");
		stilo.scrivi("ab");
		blanc.scrivi("#?!:;ab");
		
		System.out.println("Penna biro: " + biro.toString() 
						+ "Pennarello stilo: " + stilo.toString()
						+ "Stilografica blanc: " + blanc.toString());
		
	}

}

