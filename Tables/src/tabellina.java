
//implementare un programma che chieda all'utente di inserire 
//un valore numerico che consenta di generare 
//la tabellina, del valore inserito, mediante un metodo
//Quindi implementare il metodo che restituisca tale tabellina
//e definire un metodo che mi consenta di stamparlo
//invocare all'interno del metodo main i metodi implementati

import java.util.Scanner;

	public static int [] tabellina (int n) {
		int [] vett = new int [10];
		
		public static void main(String[]args) 
		{	
		
			int n, v;
			  System.out.println("Enter an integer to print it's table");
			   Scanner in = new Scanner(System.in);	
			   n = in.nextInt();
			   System.out.println("Table of " + n)
			   for (vett=1; vett<=10;vett++)
				   System.out.println(n + "*" + vett + " = " + (n*vett));	
			   
		//return vett;
		
	}

}

/*
  public class stampa (int[] vett {
 
	public class int [] tabellina (int n) {
		
		//istruzioni
		stampa vett[0]+"*"+(i+1)+"="+vett[i]
		
	}

*/
	
	
	
	/*


6.	  {
7.	    int n, vett;
8.	    System.out.println("Enter an integer to print it's multiplication table");
9.	    Scanner in = new Scanner(System.in);
10.	    n = in.nextInt();
11.	    System.out.println("Multiplication table of " + n);
12.	 
13.	    for (c = 1; c <= 10; c++)
14.	      System.out.println(n + "*" + c + " = " + (n*c));
15.	  }
16.	}



	 * 
	 * 
	 */
