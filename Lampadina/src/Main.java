import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
		   
	    public static void main(String[]args){
	   
	    ArrayList<Lampadina> lampadine = new ArrayList<Lampadina>() ;
	    Scanner input = new Scanner(System.in);
	    int repeat = input.nextInt();
	     input.nextLine();
	     input.close();
	   

	    for (int x=1; x<=repeat; x++) {
	       Lampadina temp = new Lampadina();
	       lampadine.add(temp);
	     }

}
}
