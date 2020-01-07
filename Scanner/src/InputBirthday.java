import java.util.Scanner;
public class InputBirthday {

		    public static void main (String[] args) {
		    	
		    	
		    	System.out.println("Program inputBirthDay");
		    	System.out.println("On what day of the month were you born?");
		    	Scanner input=new Scanner(System.in);
		    	
		       int day=input.nextInt();
		        System.out.println(day);
		        
		        
		        
		       
		   
		  System.out.println("What is the name of the month in which you were born?");
		  Scanner inp=new Scanner(System.in);
		  String month=input.nextLine();
		  System.out.println(month);
		  
		  System.out.println("During what year you were born?");
		  Scanner in=new Scanner(System.in);
		  int year=input.nextInt();
		  System.out.println(year);
		  
		  System.out.println("You were born on"+ month + day + "," + year + "." + "You're mighty old!");
		  
		  input.close();
		  inp.close();
		  in.close();
	}

}
