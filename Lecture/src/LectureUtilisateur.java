import java.util.Scanner;

public class LectureUtilisateur {
	
	/*public static void main(String[]args) {
		
		Scanner clavier = new Scanner(System.in);
		
		//initialization variable que je vais ca l'utilisateur ecrit
		int n = 0;
		
		System.out.println ("Entre en nombre ");
		
		n = clavier.nextInt();
				
			System.out.println ("Le carre est: "+ (n*n));
		
		
	}*/
/*public static void main(String[] args){
	
	Scanner clavier = new Scanner(System.in);
	
	double n=0.0;
	System.out.println("Entre un nombre reel: ");
	
	n = clavier.nextDouble();


	System.out.println("Le carre est: " + (n*n));
	
	
}*/
public static void main(String[] args) {
	Scanner clavier = new Scanner(System.in);
	String s = "Bravo";
	System.out.println("Entrer un text: ");
	s = clavier.nextLine();
	
	System.out.println("Vous avez rentrer le text: " + s);
}
	
}