

  
/*
 * import java.util.Scanner;
  public class JavaExample {

	  public static void getVowels(char aChar, String aString)
		{

		  System.out.print("Your string has the following vowels: ");
		  
		    for (int i = 0; i < aString.length(); i++)
		    {
		      if ((aString.charAt(i) == 'a') || (aString.charAt(i) == 'e') || (aString.charAt(i) == 'i') || (aString.charAt(i) == 'o') || (aString.charAt(i) == 'u')) 
		      {
		       // aChar = aString.charAt(i);
		        //System.out.print(aChar + " ");
		    	  System.out.print(aSring);
		    	  
		        }
		   }  
		    input.close();
		}
		}
		*/

  import java.util.Scanner;
 


  public class JavaExample {

    public static void main(String[] args) {

    	double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");

        num1 = scanner.nextDouble();
        System.out.print("Enter second number:");
        num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();
        double output;

        switch(operator)
        {
            case '+':
            	output = num1 + num2;
            	// ris=somma(val1+val2);
                break;

            case '-':
            	output = num1 - num2;
            	// ris=differenzs(val1-val2);
                break;

            case '*':
            	output = num1 * num2;
            	// ris=moltipl(val1*val2);
                break;

            case '/':
            	output = num1 / num2;
            	// ris=divisione(val1+val2);
            	if (num2==0)

            	//return 0;
            
                break;

            default:
            	
                System.out.printf("You have entered wrong operator");
                return;
              
             
            	 System.out.println (divisione per 0 non consentita)
        }
        System.out.println(num1+" "+operator+" "+num2+": "+output);
    }
}
*/

//charop=operazione.charAt(0);
//if(op=='+') as it does not exist nextchar

/*
 * int ris=0;
 * if 
 * 
 * else if
 * 
 * else if
 * 
 * else if
 * 
 * else if
  */

/*
 * public static int somma (int val1, int val2) {
 * int ris=val1+val2;
 * return ris;
 *  }
