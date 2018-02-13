import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {

		System.out.println("Welcome to Pig Latin Translator!");
		System.out.println();
		System.out.println("Enter a line to be translated:");
		// Scanner= classdatatype scnr=VariableName = new=how you create an object
		// System.in=paramter/or constructor ClassDataType
		Scanner scnr = new Scanner(System.in);

		// returning string
		String userInput = scnr.nextLine().toLowerCase();
		String outPut = " ";
		String[] words = userInput.split(" ");
		for (int i = 0; i < words.length; i++) {

			// Find out if input has a vowel
			boolean isVowel = isFirstVowel(words[i]);

			if (isVowel) {
				// starts with vowel code
				outPut = addWay(words[i]);
			} else {
				// starts w/ consonant code
				outPut = addAy(words[i]);
			}
			System.out.print(outPut + " ");
		}
		

	}

	public static boolean isFirstVowel(String userInput) {
		char letter = userInput.charAt(0);// dataType variable = value
		if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
			return true;
		} else {
			return false;
		}
	}
	

	public static String addWay(String userInput) {
		// Add code to translate addWay
		return userInput.concat("way"); // don't forget the return value
	}

	

	private static String addAy(String words) {
		

		for (int i = 0; i < words.length(); i++) {
			char letter = words.charAt(i);
			if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
				String Firstsubstring = words.substring(0, i);
				String Secondsubstring = words.substring(i);
				Firstsubstring.concat("ay");

				return Secondsubstring + Firstsubstring + ("ay");
			}
			// return latin.toString();

		}
		return words;
	}
}
