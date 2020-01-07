
import java.util.Scanner; 
public class PrimaApp {
public static void main (String[]args) {

Scanner in=new Scanner(System.in);
				System.out.println("inserisci nome:");
				String name = in.nextLine();
				
				System.out.println("inserisci eta");	
				int g = in.nextInt();
				
				System.out.println("inserisci altezza");
				String h = in.nextLine();
				in.nextLine();
				
				System.out.println("inserisci cognome");	
				String cognome = in.nextLine();
				
			System.out.println("nome: "+ name + "\ncognome: "+"\nEta" + g+ "\nAltezza"+ h);	
			in.close();
			}
			}
				