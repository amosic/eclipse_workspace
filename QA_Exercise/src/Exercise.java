
public class Exercise {
	public void calculateTax()
	{
	   Scanner sc = new Scanner(System.in);
	   
	   int price;
	   double tax = price * 0.08;
	   System.out.println("Enter price value: ");
	   price = sc.nextInt();
	   System.out.println("Sales tax is $" + tax);
	}
	      


}
