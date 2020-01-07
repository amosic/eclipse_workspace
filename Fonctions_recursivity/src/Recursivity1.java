
public class Recursivity1 {
	public static void main(String[] args) {
		System.out.println(factoriel(4));
		
		
	}
	static int factoriel (int n) {
		//if n=0 or 1 return 1 because the facoriel of 0 and 1 is 1
		if(n == 0 || n==1) {
			return 1;
		}else {
			return n * factoriel(n-1);
			
					
		}
		
	}

}

//to have a much better to understand code we could use the recursivity
//5! = 5*4*3*2*1
//4! = 4*3*2*1, so 5!= 5*4!
//n! = n * (n-1)!, 5* factoriel(4)=24, 4*factoriel(3)=6, 3*factoriel(2)=2, 2*factoriel(1)=1, 1*factoriel(0)=1;
//a method (static int factoriel(int(n)) can call itself (return n * factoriel (n-1)). 
