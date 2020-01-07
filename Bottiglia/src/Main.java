
public class Main {
	public static void main(String[] args) {
        
        Bottle aqua = new Bottle("acqua", 500);
        Bottle cocacola = new Bottle("cocacola", 500);
		Bottle fanta = new Bottle("fanta", 500);
		
		fanta.bevi(100.0);
		cocacola.bevi(50.0);
		fanta.riempi(150);
		cocacola.riempi(25);
			
		aqua.getContent();
		cocacola.getContent();
		fanta.getContent();
		
	
	
		VendingMachine vendingmachine = new VendingMachine();

		Bottle bought = vendingmachine.getBottle(3);
		
		bought.getContent();
		    /*
		     * VendingMachine.bottleSold ("aqua", 1);{
			vendingmachine.bottleSold ("aqua", 1);{
			vendingmachine.bottleSold ("aqua", 1);{
		    vendingmachine.bottleSold("cocacola", 1);{
		    vendingmachine.bottleSold("fanta",1);{
		}
		*/

/*		System.out.println("Bottle bought: " + utente.bottleBought.number() + ".");
//System.out.println("Bottles bought by " + utente.type + " " + utente.number + number +utente.bottlesBought.qta());

if (vendingmachine.bottleSold(utente1, “aqua”){
			System.out.println(utente1.type + " " + utente1.number + " can take the bottle");
		 else {
			System.out.println(utente1.type + " " + utente1.number+ " has not bought a bottle");

if (vendingmachine.bottleSold(utente2, “aqua”){
				System.out.println(utente2.type + " " + utente2.number + " can take the bottle");
			 else {
				System.out.println(utente2.type + " " + utente2.number+ " has not bought a bottle");
						
if (vendingmachine.bottleSold(utente3, “aqua”){
					System.out.println(utente3.type + " " + utente3.number + " can take the bottle");
				 else {
					System.out.println(utente3.type + " " + utente3.number+ " has not bought a bottle");
			
		Object utente1;
		if (vendingmachine.bottleSold(utente4, “cocacola”)){
			System.out.println(utente4.type + " " + utente4.number + " can take the bottle of cocacola");
		} else {
			System.out.println(utente4.type + " " + utente4.number + " has not bought a bottle");
		};
		
		if (vendingmachine.checksBottle(utente5, “fanta”)){
			System.out.println(utente5.cognome + " " + utente5.type + " can take the bottle of fanta");
		} else {
			System.out.println(utente5.type + " " + utente5.number + " has not bought a bottle");
		};
		*/
		
	
  }
}
		
	




