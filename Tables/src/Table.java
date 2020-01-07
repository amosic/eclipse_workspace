
import java.util.Scanner;
public class Table {
public static void main(String[]args) {

int a, b, c, d;

System.out.println("Enter range of numbers to print their multiplication tables");
Scanner input = new Scanner(System.in);

a = input.nextInt();
b = input.nextInt();

for (c = a; c <= b; c++) {
System.out.println("Multiplication table of "+c);

for (d = 1; d <= 10; d++) {
System.out.println(c+"*"+d+" = "+(c*d));
}
input.close();
}
}
}





import java.util.Scanner;

public class JavaExample {

    public static void main(String[] args) {

    	double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");

        /* We are using data type double so that user
         * can enter integer as well as floating point
         * value
         */
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
                break;

            case '-':
            	output = num1 - num2;
                break;

            case '*':
            	output = num1 * num2;
                break;

            case '/':
            	output = num1 / num2;
                break;

            /* If user enters any other operator or char apart from
             * +, -, * and /, then display an error message to user
             * 
             */
            default:
                System.out.printf("You have entered wrong operator");
                return;
        }

        System.out.println(num1+" "+operator+" "+num2+": "+output);
    }
}