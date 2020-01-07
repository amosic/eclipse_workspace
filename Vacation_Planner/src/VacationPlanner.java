/*
import java.util.Scanner;

public class main VacationPlanner {
	
	public.static.void.main(String[] args){
		System.out.println("Vacation Planner");
		
		public static void intro() {
		  
		
		// takes in user name and destination
		System.out.println("Welcome to Vacation Planner!");
		System.out.println("What is your name?");
    	Scanner input=new Scanner(System.in);
    	
       int day=input.nextInt();
        System.out.println(day);
        

		
	}
		
		
		public static void budget() {
			Scanner input = new Scanner(System.in);
		}
			
			//takes in days planned on trip and currency
		}
		public static void time() {
			Scanner input = new Scanner(System.in);
			
			//takes in the time difference between home and destination
			
		}
		
		public static void distance() {
			Scanner input = new Scanner(System.in);
			
			//takes in the distance between home and destination in square kilometers and converts into squares miles
		}

}

*/
import java.text.DecimalFormat; 
import java.util.Scanner; 
public class VacationPlanner { 
	public static void main(String[] args){ intro(); 
	travelTimeAndBudget(); 
	timeDiffer(); 
	countryArea(); 
	distance(); } 
	public static void intro(){ 
		Scanner input = new Scanner(System.in); 
		//takes in name and destination 
		System.out.println("Welcome to Vacation Planner!"); 
		System.out.print("What is your name?"); 
		String name = input.nextLine(); 
		System.out.print("Nice to meet you " + name+ ", Where are you travelling to?" ); 
		String city = input.nextLine(); System.out.println("Great! " + city + " sounds like a great trip"); 
		System.out.println("****"); 
		input.close();
	}
	


public static void travelTimeAndBudget(){
    Scanner input = new Scanner(System.in);
    
    //takes in travel time and budget
    System.out.print("How many days are you going to spend travelling?");
    int day = input.nextInt();
    System.out.print("How much money, in USD, are you planing to spend on your trip?");
    double budgetInUSD = input.nextDouble();
    System.out.print("What is the three letter currency symbol for your travel destination?");
    String localCurrencySymbol = input.next();
    
    //takes in local currency symbol
    System.out.print("How many " + localCurrencySymbol + " are there in 1 USD?");
    //double exchangeRate = input.nextDouble();
    
    // Takes in exchange rate
    System.out.println("");
    // leave a new line space
    System.out.println("If you are travelling for " + day + " days that is the same as " + day*24  + " hours or "
            + day*24*60 + " minutes");
    
    double budgetPerDayInUSD = budgetInUSD / day;
    DecimalFormat df = new DecimalFormat("#.##");
    System.out.println("If you are going to spend $" + budgetInUSD +
                " USD that means per day you can spend up to $" + df.format(budgetPerDayInUSD) + " USD");

    //convert USD to MXC
    double budgetInMXC = budgetInUSD * 19.8;
    double budgePerDayInMXC = budgetInMXC / day;
    System.out.println("Your total budget in " + localCurrencySymbol + " is " +
            budgetInMXC + " MXC, "+ "which per day is " + df.format(budgePerDayInMXC) +
            " " + localCurrencySymbol);
    System.out.println("**********");
    input.close();
};

public static void timeDiffer(){
    Scanner input = new Scanner(System.in);
    //takes in hour difference
    
    System.out.println("");
    System.out.print("What is the time difference, in hours, between your " +
            "home and your destination?");
    int hourDiffer = input.nextInt();
    
    // save the hour difference

    int localTime1 = (24 + hourDiffer) % 24;
    int localTime2 = (12 + hourDiffer) % 24;
    System.out.println("That means that when it is midnight at home it will be " + localTime1 + ":00 in" +
            " your travel destination \n and when it is noon at home it will be " + localTime2 +":00" );
    System.out.println("**********");
    input.close();
};

public static void countryArea(){
    Scanner input = new Scanner(System.in);
    //takes in destination country in km2
    
    System.out.print("What is the square area of your destination country in km2?");
    int squareAreaInKm = input.nextInt();
    //convert km2 to miles
    
    double squareAreaInMiles = squareAreaInKm / 2.589988 ;
    int squareAreaInMiles2 = (int) (squareAreaInMiles *100);
    double squareAreaInMiles3 = squareAreaInMiles2 / 100.0;

    System.out.println("In miles2 that is " + squareAreaInMiles3);
    input.close();
};

public static void distance(){
    Scanner input = new Scanner(System.in);
    System.out.print("What is your home's location? \nLatitude:");
    double homeLati = input.nextDouble();
    System.out.print("Longitude:");
    double homeLongi = input.nextDouble();
    System.out.print("What is your destination location? \nLatitude:");
    double destiLati = input.nextDouble();
    System.out.print("Destination longitude:");
    double destiLongi = input.nextDouble();

    //the following is adapted from https://rosettacode.org/wiki/Haversine_formula#Java
    double earthRadius = 6372.8; // In kilometers
    double dLat = Math.toRadians(destiLati - homeLati);
    double dLon = Math.toRadians(destiLongi - homeLongi);
    homeLati = Math.toRadians(homeLati);
    destiLati = Math.toRadians(destiLati);

    double a = Math.pow(Math.sin(dLat / 2 ), 2)
            +  Math.pow(Math.sin(dLon /2), 2)
            * Math.cos(homeLati) * Math.cos(destiLati);

    double c = 2 * Math.asin((Math.sqrt(a)));
    double distance = convertValues(earthRadius * c, 2);

    System.out.println("The travel distance is " + distance + " km.");
    System.out.println("Have a nice holiday!");
    input.close();
}

public static double convertValues(double value, double decimalPlaces)
{
    // Method for truncating a double to x decimal places
    // separate method so I can reuse it, but I have to take inputs and return values
    // since the hacker project requires the math lang import I can do exponents
    // I copied from this programme https://courses.edx.org/courses/course-v1:Microsoft+DEV276x+1T2019a/courseware/af5e9113c16c49d698dd0f95924f663a/f74ffdf01641458a8393aaf2ae585a77/?child=first
    double powerOfTen = Math.pow(10, decimalPlaces);
    double multipliedValue = value * powerOfTen;
    int intValue = (int) multipliedValue;
    double convertedValue = intValue / powerOfTen;

    return convertedValue;
}
}
