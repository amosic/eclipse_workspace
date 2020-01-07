
public class Fonctions {
	public static void main(String[] args) {
		//I call the method at the level of the main method
		//we want to find out the sqrt of 25
		System.out.println(square_root_double(2));
		
		//System.out.println(nr_double(2));//the nr_double is not defined in "Fonction", but only in the method "sqrt_root_double"
}
	//method which should take as parameter a number and should return its square root (eg int nr)

	//if we have a method and we declare variables inside that method those variables are only local (we can use the variables only inside that method. If we try to use the variable outside the method we will have errors (it will say that the variables have only a local use, declared inside a method)
	static double square_root_double(int nr) {
		//and it should return the square root of the number
		//I can use the class Math and its method sqrt which returns the sqrt of nr that I pass as parameter in the paranthesis
		
		
		//to make the double of a nr followed by the sqrt I have to write before return the int of our nr = our nr multiplied by 2
		//the variable double can be used only inside the method "square_root_double"
		int nr_double = nr * 2; //if we declare a method and we have variables at the method level
		return Math.sqrt(nr_double);
		//error showing that I should add a cast to int eg "return (int) Math.sqrt(nr)" (as it normally returns a double, I can either add (int) and transform the double into int or I can add double at the method level (eg static double boom(int nr)).
	//return Math.pow(nr, 0.5);//with the square_root method we can get the sqrt of the nr at the level of return
	}
}


