package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordCriteria {

	public static void main(String[] args) {
		
		//	1. Read a file that contains multiple sets of passwords (use http://www.theonegenerator.com/ to generate a set of test data)
			
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
		
		// Print stored passwords in passwords array to the user
		for(int i=0; i<passwords.length; i++) {
			password = passwords[i];
			try {
				if (password) {
					
				}
			} catch () {
				
			}
		}
			System.out.println(password);
		}
		
		
		
		
		//	2. Verify that the password contains all of the following criteria:
		//		1. A number
		//		2. A letter
		//		3. Special character (! @ #)

		//	3. Create three User Defined Exceptions for the corresponding criteria.

		//	4. If the password does not meet the criteria, create and throw the appropriate exception
	}

}
