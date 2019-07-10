package datastructures;

public class Arrays {

	public static void main(String[] args) {
		String[] alphabet = {"a", "b", "c", "d", "e", "f"};
		
		System.out.println("The old fashioned way");
		for (int i=0; i<=5; i++) {
			System.out.print(alphabet[i] + " ");
		}
		
		System.out.println("\nUsing the length property");
		
		for (int n=0; n<alphabet.length; n++) {
			System.out.print(alphabet[n] + " ");
		}
		
		System.out.println("\n\nUsing the For-Each method");
		for (String letter : alphabet) {
			System.out.print(letter + " ");
		}
		
		System.out.println("\n\nDouble Arrays");
		String[][] users = { 
					{"John", "Williams", "jw@testemail.com", "12346789"}, 
					{"Sarah", "Jackson", "sj@testemail.com", "2102335333"},
					{"Rachel", "Wallace", "rw@testemail.com", "210383384"} 
				};
		// Get the size of array
		int numOfUsers = users.length;
		int numOfFields = users[0].length;
		System.out.println("Number of Users: " + numOfUsers);
		System.out.println("Number of Fields: " + numOfFields);
		
		// Traverse the double array
		System.out.println("\n\nUsing OLD WAY");
		for (int i=0; i<numOfUsers; i++) {
			System.out.print("[ ");
			for (int j=0; j<numOfFields; j++) {
				System.out.print(users[i][j] + " ");
			}
			System.out.println(" ]");
		} 
		
		System.out.println("\n\nUsing ONE FOR LOOP");
		for (int i=0; i<numOfUsers; i++) {
			String firstname = users[i][0];
			String lastname = users[i][1];
			String email = users[i][2];
			String phone = users[i][3];
			System.out.println(firstname + " " + lastname + " " + email + " " + phone);
			
		}
		
		System.out.println("\n\nUsing FOR EACH");
		for (String user[] : users) {
			System.out.print("[ ");
			for (String field : user) {
				System.out.print(field + " ");
			}
			System.out.println(" ]");
		}
		
	}
}
