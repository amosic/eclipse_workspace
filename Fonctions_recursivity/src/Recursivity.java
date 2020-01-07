
public class Recursivity {
	
	public static void main(String[] args) {
		System.out.println(factoriel(4));

}
	//we write our method factoriel. My method will return an int, will be called factoriel and will take a parameter (also an int)
	//the 1st thing is that the nr should be an int positive. So I say that "if" nr is less than 0, then we should write something (with "System.out.println".. , telling the user that the nr should be an int positive)
	//in the opposite case "else" we can take what the user entered and treat as value and return the factoriel. So I should use a "for" cycle, i will start from 1, i will stop at our nr itself, and at every cycle we will add 1 at i)
	//i need a variable which will contain the result, so i will declare my variable at this level and i will call it here  "res". Par default my variable will be 1. Everytime we willl do the cycle we will take what we have at the res level, we multiply by i and we put after at the res level. 
	//I return res
	static int factoriel(int nr) {//error: this method must return a result of type int. But our method does not return any int, anything..So we add return -1; to show that something is wrong
		                          // so now we have only to test our method, by adding in main Sysout println, you can only show me the result that will be returned by 5!)
		if(nr<0) {
			System.out.println("The number should be an int > 0");
			return -1;
		}else {
			
			int res = 1;
			
			for(int i = 1; i<=nr; i++) {
				res = res * i;
		
			}
			//if we calculate the 5!. We have when i = 1, we multiply i* res(so 1*1, and we get 1, if i=2, we multiply 2*1=2..i=3, 3*2*1..i=5, 5*4*3*2*1)
			return res;
			
		}
		
	}
}



























/* 
 * Recursivity
 * A method could call itself (un metodo puo chiamare se stesso). In this case we talk about recursivity.
 * To understand this fact we will make a programme called factoriel of numbers.
 * 4!=1*2*3*4= 4*3*2*1
 * 5!= 1*2*3*4*5
 * 0!=1
 * 1!=1
 * 
 */

