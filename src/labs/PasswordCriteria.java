package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordCriteria {

	public static void main(String[] args) {
		
		//	1. Read a file that contains multiple sets of passwords 
		//	(use http://www.theonegenerator.com/ to generate a set of test data)
			
			// Define the path of file
		String filename = "/Users/hashmatullah.noorzai/eclipse-workspace/JavaTraining/Files/Passwords.txt";
			// Create the file in Java
		File file = new File(filename);
		String[] passwords = new String[13];
		String password = null;
		try {
			// Create a file reader that reads from the file
			BufferedReader br = new BufferedReader(new FileReader(file));
			for(int i=0; i<passwords.length; i++) {
				//Store passwords in passwords array
				passwords[i] = br.readLine();
			}
			
			br.close(); //close resources
		} catch (FileNotFoundException e) {
			System.out.println("Error: File not found");
		} catch (IOException e) {
			System.out.println("Error: Could not read file");
		}
		
			// Print stored passwords in passwords_array to the user
		for(int i=0; i<passwords.length; i++) {
			password = passwords[i];
		//	2. Verify that the password contains all of the following criteria:
			try {
				//		1. A number
				Pattern numP = Pattern.compile(".*\\d.*");
				Matcher numM = numP.matcher(password);
				if (!numM.find()) {
					throw new NumberException(password);
				}
				//		2. A letter
				Pattern letterP = Pattern.compile(".*[a-zA-Z]");
				Matcher letterM = letterP.matcher(password);
				if (!letterM.find()) {
					throw new LetterException(password);
				}
				//		3. Special character (! @ #)
				Pattern spcCharP = Pattern.compile(".*[!@#]");
				Matcher spcCharM = spcCharP.matcher(password);
				if (!spcCharM.find()) {
					throw new SpecialCharException(password);
				}
				System.out.println(password);
		//	4. If the password does not meet the criteria, create and throw the appropriate exception
			} catch (NumberException e) {
				System.out.println("ERROR: Password requires a number");
				System.out.println(e.toString());
			} catch (LetterException e) {
				System.out.println("ERROR: Password requires a letter");
				System.out.println(e.toString());
			} catch (SpecialCharException e) {
				System.out.println("ERROR: Password requires a special character, choose from: !@#");
				System.out.println(e.toString());
			}
		}
	}
}

//	3. Create three User Defined Exceptions for the corresponding criteria.
class NumberException extends Exception {
	String numInPassword;
	NumberException(String numInPassword) {
		this.numInPassword = numInPassword;
	}
	public String toString() {
		return ("NumberException: " + numInPassword);
	}
}

class LetterException extends Exception {
	String letterInPassword;
	LetterException(String letterInPassword) {
		this.letterInPassword = letterInPassword;
	}
	public String toString() {
		return ("LetterException: " + letterInPassword);
	}
}

class SpecialCharException extends Exception {
	String specialCharInPassword;
	SpecialCharException(String specialCharInPassword) {
		this.specialCharInPassword = specialCharInPassword;
	}
	public String toString() {
		return ("SpecialCharException: " + specialCharInPassword);
	}
}