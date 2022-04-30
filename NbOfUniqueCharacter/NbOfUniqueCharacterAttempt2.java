//This problem was given in quiz III in COE211
//The goal is to get the number of unique characters in a given string

//Imports
import java.util.Scanner;

public class NbOfUniqueCharacterAttempt2{
	public static void main(String[] args){

		//Getting user input
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your String: ");
		String inputStr = new String(scan.nextLine());
		String tempStr = inputStr;

		//Loop to delete all characters that are not unique
		for (int i =0; i<inputStr.length(); i++){
		char c = inputStr.charAt(i);
			if(inputStr.indexOf(c) != inputStr.lastIndexOf(c)){
				 tempStr = tempStr.replace( c, ' ');
			}
		}

		//Removing whitespaces
		while(tempStr.indexOf(' ') != -1)
			tempStr = tempStr.substring( 0, tempStr.indexOf(' ')) + tempStr.substring(tempStr.indexOf(' ')+1);
		
		//Output
		System.out.println("Nb. of unique characters: " + tempStr.length());
	
	}
}