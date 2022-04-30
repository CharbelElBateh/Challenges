//This problem was given in quiz III in COE211
//The goal is to get the number of unique characters in a given string

//This solution does NOT cover edge cases where a character is present three or more times

//Imports
import java.util.Scanner;

public class NbOfUniqueCharacterAttempt3{
	public static void main(String[] args){

		//Getting user input
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your String: ");
		String inputStr = new String(scan.nextLine());

		//Number of unique characters from which will be deducted the duplicate characters
		int unique = inputStr.length();
		
		//Deducting duplicate characters
		for( int idx=0; idx<inputStr.length(); idx++){
			char ch = inputStr.charAt(idx);

			for (int idx2 = idx+1; idx2<inputStr.length(); idx2++){
				char ch2 = inputStr.charAt(idx2);

				//Executes only if the character has a duplicate
				if(ch == ch2){
					unique -=2;
				}

			}

		}

		//Output
		System.out.println("Nb. of unique characters: "+unique);

	}
}
