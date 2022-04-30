//This problem was given in quiz III in COE211
//The goal is to get the number of unique characters in a given string

//Imports
import java.util.Scanner;

public class NbOfUniqueCharacterAttempt1{
	public static void main(String args[]){

		//Getting user input
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your String: ");
		String inputStr = new String(scan.nextLine());

		//String storing unique characters of the input string
		String tempStr = "";

		//Loop to get the unique characters into the tempStr
		for (int i=0; i< inputStr.length(); i++){

			//Is the char unique, not a space, and not in temp?
			if(tempStr.indexOf(inputStr.charAt(i)) == -1 && inputStr.charAt(i) != ' ' && inputStr.indexOf(inputStr.charAt(i)) == inputStr.lastIndexOf(inputStr.charAt(i))){
				tempStr = tempStr + inputStr.charAt(i);
			}

		}

		//Output
		System.out.println("Nb of unique characters: "+tempStr.length());
	}
}