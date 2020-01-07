
public class Vowels {

public static void getVowels(char aChar, String aString)
{
	
  System.out.print("Your string has the following vowels: ");
  
    for (int i = 0; i < aString.length(); i++)
    {
      if ((aString.charAt(i) == 'a') || (aString.charAt(i) == 'e') || (aString.charAt(i) == 'i') || (aString.charAt(i) == 'o') || (aString.charAt(i) == 'u')) 
      {
        aChar = aString.charAt(i);
        System.out.print(aChar + " ");
        }
    }   
}
}





































/*
 * public class Vowels {
 */

/*public String vowel(String s) {

    boolean isVowel(char c);
    if (c == 'a') {
        return true;
    } else if  (c == 'e') {
        return true;
    } else if  (c == 'i') {
        return true;
    } else if  (c == 'o') {
        return true;
    } else if  (c == 'u') {
        return true;
    }
    String notVowel = "";
    int l = s.length();
    for (int z = 0; z <= l; z++) {


        if (isVowel == "false") {
            char x = s.charAt(z);
            notVowel = notVowel + x;
        }
    }
    return notVowel;
}


}
*/

/*
 * import java.util.Scanner;
 */

/*
 * public class ReversingVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();

        while (numberOfTestCases --> 0) {
            StringBuilder stringWhoseVowelsShouldBeReversed = new StringBuilder(scanner.next());
            System.out.println(reverseVowels(stringWhoseVowelsShouldBeReversed));
        }

        scanner.close();
    }

    private static String reverseVowels(StringBuilder string) {

        if (string.length() == 0 || string.length() == 1) return string.toString();

        int start = 0;
        int end = string.length() - 1;

        while (true) {
            while (! isVowel(string.charAt(start))) {
                start++;
            } 
            while (! isVowel(string.charAt(end))) {
                end--;
            }
            if (start >= end) {
                break;
            }
            else {
                swapVowels(string, start, end);
                start++;
                end--;
            }
        }
        return string.toString();
    }

    private static boolean isVowel(char character) {
        switch(character) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u': return true;
        default: return false;
        }
    }

    private static void swapVowels(StringBuilder string, int index1, int index2) {
        char tmp = string.charAt(index1);
        string.setCharAt(index1, string.charAt(index2));
        string.setCharAt(index2, tmp);
    }
    */
    

