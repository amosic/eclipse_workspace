
 
public class Scanner {
	public static void main (String[]args) {
		
Scanner in = new Scanner(System.in);
		
		System.out.println("Programma calcolo perimetro rettangolo");
		System.out.println("Inserisci base: ");
		int b = in.nextInt();
		
		System.out.println("inserisci altezza: ");	
				int h = in.nextInt();
				
				/*int p = 2*b+2*h;
				System.out.println("iL perimetro CALCOLAT E:");
				*/
				
				System.out.println("iL perimetro CALCOLAT E: p=(b+h)*2");
				//System.out.println(p);
				
	
			
	}
	
}

//se inserisco numeri e dopo voglio inserire delle stringhe devo inserire 
//in.nextLine();
// nextLine e un metodo che non richiede nessun valore perche le parantesi sonon chiuse